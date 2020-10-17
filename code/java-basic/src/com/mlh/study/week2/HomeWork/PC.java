package com.mlh.study.week2.HomeWork;

/**
 * @ClassName PC
 * @Description TODO
 * @Author lh
 * @Date 2020/10/17
 **/

public class PC {
    CPU cpu;
    HardDisk HD;
    public void setCpu(CPU u){
        this.cpu = u;
    }
    public void setHardDisk(HardDisk h){
        this.HD = h;
    }
    public void show(){
        System.out.println("cpu的速度是:" +cpu.getSpeed());
        System.out.println("HD的容量是:" +HD.getAmount());
    }
}
