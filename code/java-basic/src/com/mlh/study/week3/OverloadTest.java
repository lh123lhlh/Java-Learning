package com.mlh.study.week3;

/**
 * @ClassName OverloadTest
 * @Description TODO
 * @Author lh
 * @Date 2020/10/19
 **/

public class OverloadTest {
//    public static int sum(int a,int b){
//        return a + b;
//    }

    /**
     * 方法重载
     * @param s1
     * @param s2
     * @return
     */
    public static String sum(String s1,String s2){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s1);
        stringBuffer.append(s2);
        return stringBuffer.toString();
    }
    public static String sum(int time1,int time2){
        int time = time1 +time2;

        int hours =time / 3600;
        time = time % 3600;
        int minutes = time / 60;
        time = time %60;

        if(time1 + time2 < 60){
           return time1 + time2 +"秒";
        }else if(time1 + time2 >= 60){
            return hours +"小时"+ minutes + "分" + time + "秒";
        }
        return null;
    }
}
