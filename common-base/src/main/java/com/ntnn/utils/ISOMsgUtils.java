package com.ntnn.utils;

import io.vertx.core.json.JsonObject;
import lombok.extern.log4j.Log4j2;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;

@Log4j2
public class ISOMsgUtils {
//    public ISOMsgUtils () {
//        InputStream is = null;
//        try {
//            ISOMsg isoMsg = new ISOMsg();
//            is = getClass().getResourceAsStream("/iso/authentication.xml");
//            if(is == null) {
//                log.error("Cant found file");
//                return;
//            }
//            GenericPackager genericPackager = new GenericPackager(is);
//            isoMsg.setPackager(genericPackager);
//            isoMsg.setMTI(ISOFieldUtils.MTI_AUTHOR_RES);
//            isoMsg.set(2, "5652111212121212");
//            System.out.println(new String(isoMsg.pack(), "UTF-8"));
//        } catch (ISOException | UnsupportedEncodingException ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            if (is != null) {
//                try {
//                    is.close();
//                } catch (IOException e) {
//                }
//            }
//        }
//    }

    public static ISOMsg stringToMsg(String str, String nameFile) {
        ISOMsg isoMsg = new ISOMsg();
        try {
            GenericPackager genericPackager = new GenericPackager(FileUtils.getFileResource(nameFile));
            isoMsg.setPackager(genericPackager);
            isoMsg.unpack(str.getBytes());
        } catch (ISOException ex) {
            ex.printStackTrace();
        }
        return isoMsg;
    }
    public static JsonObject parseToJson(ISOMsg isoMsg) {
        JsonObject obj = new JsonObject();
        StringBuilder stringBuilder;
        int i;
        for(i = 0; i < isoMsg.getMaxField(); i++) {
            stringBuilder = new StringBuilder();
            obj.put(stringBuilder.append(i).toString(), isoMsg.getValue(i));
        }
        return obj;
    }
}
