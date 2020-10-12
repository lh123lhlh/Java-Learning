package com.mlh.study.week2;

import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lh
 * @Date 2020/10/12
 **/

public class Test {
    public static void main(String[] args) {

        Book book1 = new Book("Java", 30,new Date() );
        Book book2 = new Book("JavaScript", 40,new Date());
        Book book3 = new Book("Mysql", 50,new Date());
        Book book4 = new Book("数据结构", 60,new Date());
        Book book5 = new Book("Oracle", 70,new Date());

        Phone phone1 = new Phone("小米10","红色",4000);
        Phone phone2 = new Phone("苹果x","白色",8000);


        Student student1 = new Student("张三","男",new Phone[]{phone1},new Book[]{book1,book2});
        Student student2 = new Student("李四","女",new Phone[]{phone2},new Book[]{book3,book4,book5});

        Group group1 = new Group("第一组",new Student[]{student1});
        Group group2 = new Group("第二组",new Student[]{student2});

        System.out.println(Arrays.toString(group1.getStudents()));

    }
}
