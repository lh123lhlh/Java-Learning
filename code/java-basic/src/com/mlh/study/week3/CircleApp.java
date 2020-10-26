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
        //Circle circle = new Circle(10, 20, 5);
        Cylinder cylinder = new Cylinder(10, 20, 5, 6);
        point.print();
        cylinder.print();


        System.out.println("*********************");
        Point point1 = new Point(2, 2);
        Point point2 = new Point(2, 4);
        System.out.println("两点之间的距离为: " + (cauDistance(point1, point2)));

        Circle circle = new Circle(10, 20, 5);
        Point point3 = new Point(12, 23);
        boolean isIn = isContainInCircle(point3, circle);
        System.out.println(isIn ? "该点" + point3 + "在" + circle + "的圆内" : "该点"+ point3 +"不在" + circle + "的圆内");
    }

    public static double cauDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.y - b.y, 2) + Math.pow(a.x - b.x, 2));
    }

    public static boolean isContainInCircle(Point a, Circle circle) {
        double distance = Math.sqrt(Math.pow(a.y - circle.y, 2) + Math.pow(a.x - circle.x, 2));
        return distance < circle.getR();
    }

}

//创建两个Point对象，求出两点之间的距离

//创建一个Point对象，判断该点是否在上面的Circle圆对象里


