package com.mlh.study.week5;

import lombok.Builder;

/**
 * @ClassName Student
 * @Description TODO
 * @Author lh
 * @Date 2020/11/2
 **/
@Builder
public class Book {
    private String ISBN;
    private String name;
    private Integer price;

    public Book(String ISBN, String name, Integer price) {
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }
    public Book(){}

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
