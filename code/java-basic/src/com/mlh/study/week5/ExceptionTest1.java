package com.mlh.study.week5;

import javax.swing.*;
import java.util.Scanner;

/**
 * @ClassName ExceptionTest1
 * @Description TODO
 * @Author lh
 * @Date 2020/11/2
 **/

public class ExceptionTest1 {
    public static void main(String[] args) {
//        int result = 0;
//        //1.ArithmeticException by zero 算术异常
//        try{
//            result = 3 / 0;
//        }catch (ArithmeticException e){
//            JOptionPane.showMessageDialog(null,"除数不能为0");
//            System.err.println("除数不能为0");
//            System.err.println(e.getMessage());
//            //e.printStackTrace();
//        }
//        System.out.println(result);
        //2.ArrayIndexOutOfBoundsException 数组索引越界异常
//        int[] arr = new int[]{1,2,3,4};
//        try{
//            System.out.println(arr[4]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            JOptionPane.showMessageDialog(null,"数组下标越界 ");
//            System.err.println("数组下标越界");
//            System.err.println("异常的详细信息：" + e.getMessage());
//            System.err.println("异常的原因：" + e.getCause());
//            System.err.println("异常对象e：" + e.toString());
//        }
        System.out.println("请输入价格：");
        Scanner scanner = new Scanner(System.in);
        //从键盘读入一串字符
        String priceStr = scanner.nextLine();
        //将字符串转为整形
        int price = 0;
        try{
             price = Integer.parseInt(priceStr);
        }catch (NumberFormatException e ){
            JOptionPane.showMessageDialog(null,"数字格式化异常");
            System.err.println("数字格式化异常");
            System.err.println("异常的详细信息：" + e.getMessage());
            System.err.println("异常的原因：" + e.getCause());
            System.err.println("异常对象e：" + e.toString());
        }
        System.out.println("price=" + price);
   }
}
