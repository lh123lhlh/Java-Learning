package com.mlh.study.week3;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author lh
 * @Date 2020/10/19
 **/

@Getter
public class Circle extends Point {

    private int r;
    public Circle(){
        System.out.println("圆被初始化了");
    }
    public Circle(int x, int y, int r){
        super(x, y);
        this.r = r;
        System.out.println("带参数的圆被初始化了");
    }

    @Override
    public void print() {
        System.out.println("圆的面积是" +Math.PI * r * r);
    }
    public double getArea(){
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "(圆心为(" + x +"," + y +"),半径为" + r +")";
    }

}
