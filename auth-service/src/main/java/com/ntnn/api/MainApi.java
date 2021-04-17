package com.ntnn.api;

import com.ntnn.argon2.Agron2Utils;
import com.ntnn.dao.UserDAO;
import com.ntnn.gen.auth.MainApiGrpc;
import com.ntnn.gen.auth.Request;
import com.ntnn.gen.auth.Response;
import com.ntnn.jwt.JwtUtils;
import com.ntnn.utils.*;
import io.grpc.stub.StreamObserver;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import lombok.extern.log4j.Log4j2;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;

@Log4j2
public class MainApi extends MainApiGrpc.MainApiImplBase {
    public Vertx vertx;
    public String name;

    public MainApi(Vertx vertx, String name) {
        this.vertx = vertx;
        this.name =  name;
    }

    @Override
    public void authenticate(Request request, StreamObserver<Response> responseObserver) {
        String data = request.getData();
        Response response;
        if (data == null || data.equals("")) {
            response = Response.newBuilder()
                    .setErrorCode(BackendError.NOT_FOUND)
                    .setResult(false)
                    .setMessage("Data is null or blank")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }
        ISOMsg isoMsg = ISOMsgUtils.stringToMsg(data, DefineISOMsg.ISO_AUTHENTICATE);
        JsonObject jo = ISOMsgUtils.parseToJson(isoMsg);
        try {
            if (!isoMsg.getMTI().equals(ISOFieldUtils.MTI_AUTHOR_REQ)) {
                response = Response.newBuilder()
                        .setErrorCode(BackendError.NOT_FOUND)
                        .setResult(false)
                        .setMessage("Yor request ISOMessage not match")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                return;
            }
        } catch (ISOException ex) {
            log.error(ex.getMessage());
        }
        String cardNumber = jo.getString(ISOFieldUtils.CARD_NUMBER + "");
        JsonObject joUser = new JsonObject()
                .put("cardNumber", cardNumber);
        UserDAO dao = new UserDAO(vertx);
        dao.selectByCardNumber(joUser, whenDone -> {
            if(!whenDone.getBoolean("result")) {
                log.error("System error -> can not find cardNumber's user input");
                Response res = Response.newBuilder()
                        .setErrorCode(BackendError.SYSTEM_ERR)
                        .setResult(false)
                        .setMessage("System error -> can not find cardNumber's user input")
                        .build();
                responseObserver.onNext(res);
                responseObserver.onCompleted();
                return;
            }
            JsonObject joUserGetDB = whenDone.getJsonObject("data");
            String hashPin = joUserGetDB.getString("pin");
            String rawPinInput = jo.getString("pin");
            if(!Agron2Utils.verify(hashPin, rawPinInput)) {
                log.error("Access fail cause wrong pin");
                Response res = Response.newBuilder()
                        .setErrorCode(BackendError.SYSTEM_ERR)
                        .setResult(false)
                        .setMessage("System error -> can not find cardNumber's user input")
                        .build();
                responseObserver.onNext(res);
                responseObserver.onCompleted();
                return;
            }
            JsonObject objToken = new JsonObject()
                    .put("cardNumber", cardNumber)
                    .put("name", joUserGetDB.getString("name", ""));
            String token = JwtUtils.jwt(this.vertx, objToken);
            Response res = Response.newBuilder()
                    .setResult(true)
                    .setErrorCode(BackendError.SUCCESS)
                    .setMessage("Access pin success")
                    .setData((new JsonObject().put("token", token)).toString())
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
            return;
        });
    }

    @Override
    public void retrieve(Request request, StreamObserver<Response> responseObserver) {
        super.retrieve(request, responseObserver);
    }

    @Override
    public void getProfile(Request request, StreamObserver<Response> responseObserver) {
        super.getProfile(request, responseObserver);
    }

    @Override
    public void resetPin(Request request, StreamObserver<Response> responseObserver) {
        super.resetPin(request, responseObserver);
    }
}
