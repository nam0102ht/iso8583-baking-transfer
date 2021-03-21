package com.ntnn.api;

import com.ntnn.gen.auth.MainApiGrpc;
import com.ntnn.gen.auth.Request;
import com.ntnn.gen.auth.Response;
import com.ntnn.utils.*;
import io.grpc.stub.StreamObserver;
import io.vertx.core.json.JsonObject;
import lombok.extern.log4j.Log4j2;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;

@Log4j2
public class MainApi extends MainApiGrpc.MainApiImplBase {
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
