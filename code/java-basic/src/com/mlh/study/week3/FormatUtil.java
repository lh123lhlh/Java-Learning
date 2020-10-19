package com.mlh.study.week3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author lh
 * @Date 2020/10/19
 **/

/**
 * @param
 * @author lh
 */
public class FormatUtil extends Date {
    public synchronized static String format(Date date,Locale tz){
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",tz);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return sdf.format(date.getTime());
    }


}
