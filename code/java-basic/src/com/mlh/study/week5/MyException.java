package com.mlh.study.week5;

/**
 * @ClassName MyException
 * @Description TODO
 * @Author lh
 * @Date 2020/11/7
 **/

public class MyException extends Exception{
    private String msg;

    public MyException(String msg){
        super();
        this.msg = msg;

    }
    public String showMsg(){
        return this.msg;
    }
}
