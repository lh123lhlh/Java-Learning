package com.mlh.study.week1;

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
            a[i] = random.nextInt();
        }

    }
}
