package com.mlh.study.week3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName MyDate
 * @Description TODO
 * @Author lh
 * @Date 2020/10/19
 **/

public class MyDate extends Date {
    /**
     *
     * @return
     */
    @Override
    public synchronized String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        return sdf.format(this);
    }

    public static void main(String[] args) {
        MyDate mydate = new MyDate();
        System.out.println(mydate.toString());
        System.out.println(FormatUtil.format(new Date(), Locale.CHINA));

    }
}
