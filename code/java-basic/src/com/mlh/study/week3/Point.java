package com.mlh.study.week3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Point
 * @Description TODO
 * @Author lh
 * @Date 2020/10/19
 **/

public class Point {
    public Integer x;
    public Integer y;
    public Point(){
        System.out.println("点被初始化");
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("带参数的点被初始化");
    }
    public void print(){
        System.out.println("横坐标是:" +this.x + ",纵坐标是:" +this.y);
    }
}
