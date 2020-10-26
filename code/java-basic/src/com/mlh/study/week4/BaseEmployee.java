package com.mlh.study.week4;

/**
 * @ClassName 基础的员工抽象类
 * @Description TODO
 * @Author lh
 * @Date 2020/10/26
 * 抽象类不能被实例化
 * 抽象类中可以没有抽象方法 但有抽象方法一定是抽象类
 * 抽象类中的方法只能声明，不能有方法体
 * 构造方法，类方法不能是抽象方法
 * 抽象类的子类必须必须给出父类声明抽象方法，不声明则必须继续定义为抽象
 **/

public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class ");
    }

    /**
     * 发工资
     *
     * @return int
     */
    public abstract int getSalary();



}
