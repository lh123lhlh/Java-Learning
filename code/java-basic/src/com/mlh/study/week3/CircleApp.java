package com.mlh.study.week3;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author lh
 * @Date 2020/10/19
 **/

public class CircleApp {
    public static void main(String[] args) {
        Point point = new Point(10, 30);
        Circle circle = new Circle(10, 20, 5);
        Cylinder cylinder = new Cylinder(10, 20, 5, 6);
        point.print();
        cylinder.print();
        circle.print();
    }
}
