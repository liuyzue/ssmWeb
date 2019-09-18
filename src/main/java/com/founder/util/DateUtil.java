package com.founder.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.util
 * @date:2019/9/17
 * @time:16:14
 */
public class DateUtil {
    private static final String FORMAT="y/M/d k:m:s";

    public static String lastDay(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat(FORMAT);
        String dateStr=sdf.format(date.getTime()-1 * 24 * 60 * 60 * 1000);
        return dateStr;
    }
    public static  String toDay(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat(FORMAT);
        String dateStr=sdf.format(date);
        return dateStr;
    }
    public static String lastDay(Date date,Integer plus){
        SimpleDateFormat sdf=new SimpleDateFormat(FORMAT);
        String dateStr=sdf.format(date.getTime()+ plus * 24 * 60 * 60 * 1000);
        return dateStr;
    }
}
