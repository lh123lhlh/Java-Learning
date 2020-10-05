package com.mlh.study.week1;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author lh
 * @Date 2020/10/5
 **/

public class ArrayTest {
    final static int MAX = 5;
    public static void main(String[] args) {
        int[] a = new int[MAX];
        //创建随机数种子
        Random random =new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //1.用一次循环把最大值，最小值，和求出来
        int maxNum = a[0];
        int minNum = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            //最大值
            if(a[i] > maxNum){
                maxNum = a[i];
            }
            //最小值
            if (a[i] < minNum){
                minNum = a[i];
            }
            //求和
            sum = sum +a[i];
        }
        System.out.println("最大值为"+maxNum);
        System.out.println("最小值为"+minNum);
        System.out.println("数组和为"+sum);

        //2.排序
        /**
         * 引用java自带类
         */
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
        System.out.println();
        /**
         * 冒泡排序
         */
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j] > a[j+1]){
                    int num = a[j];
                    a[j] = a[j+1];
                    a[j+1] = num;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }

}
