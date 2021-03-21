package com.ntnn.json;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtils {
    public static boolean isJSON(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        try {
            JSONObject obj = new JSONObject(str);
            return true;
        } catch (JSONException ex) {
            return false;
        }
    }
}
