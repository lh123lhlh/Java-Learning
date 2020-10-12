package com.mlh.study.week2;
import lombok.Getter;
import lombok.ToString;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author lh
 * @Date 2020/10/12
 **/

@ToString
public class Book {
    private String name;
    private Integer price;
    private Date date;

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book(){}

    public Book(String name, Integer price, Date date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }
   /* public static String dateToStr(java.util.Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(dateDate);
        return dateString;

    }
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Java";
        book.price = 50;
        Date date = new Date();
        System.out.println("《" + book.name + "\t 价格为:" + book.price + "\t出版日期为："+ date.toString() +"》");
    }*/
}
