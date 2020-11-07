package com.mlh.study.week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ExceptionTest2
 * @Description TODO
 * @Author lh
 * @Date 2020/11/2
 **/

public class ExceptionTest2 {
    public static void main(String[] args){
//        File file = new File("D:\\宿舍\\607宿舍照片");
//        InputStream is = new FileInputStream(file);
        try{
            byte[] b =readFile("D:\\宿舍\\607宿舍照片\\凌浩.jpg");
        }catch (IOException e){
            System.err.println("出现IO异常");
        }finally {    //常常用于数据库连接的关闭，线程池资源回收，IO流的关闭等
            System.out.println("无论有无异常都会执行的代码段");
        }
        System.out.println("其他代码");
    }
    public static byte[] readFile(String path) throws IOException {
        File file = new File(path);
        byte[] b =new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result);
        is.close();
        return b;
    }
}
