package com.vito.backendexample.mutithread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * * @Author: Vito
 * * @Date 2020/10/29 13:16
 * @Descripe： test the issue of unsafe about SimpleDateFormat
 **/
public class DateUtil {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static  String formatDate(Date date)throws ParseException {
        return sdf.format(date);
    }

    public static Date parse(String strDate) throws ParseException{

        return sdf.parse(strDate);
    }
}
