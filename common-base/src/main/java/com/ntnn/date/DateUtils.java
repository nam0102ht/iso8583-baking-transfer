package com.ntnn.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date stringToDate(String str) {
        SimpleDateFormat smf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        try {
            date = smf.parse(str);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date;
    }

    public static String dateToString(Date date) {
        SimpleDateFormat smf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String str = "";
        try {
            str = smf.format(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
