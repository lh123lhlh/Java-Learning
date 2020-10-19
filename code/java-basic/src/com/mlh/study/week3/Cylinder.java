package com.mlh.study.week3;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author lh
 * @Date 2020/10/19
 **/

public class Cylinder extends Circle {
    private int h;
    public Cylinder(){
        System.out.println("圆柱体被初始化了");
    }
    public Cylinder(int x, int y, int r, int h){
        super(x, y, r);
        this.h = h;
        System.out.println("带参数的圆柱体被初始化了");
    }

    @Override
    public void print() {
        System.out.println("圆柱体的体积是" +super.getArea() * this.h);
    }
}
