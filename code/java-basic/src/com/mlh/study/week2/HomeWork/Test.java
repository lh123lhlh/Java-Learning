package com.mlh.study.week2.HomeWork;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lh
 * @Date 2020/10/17
 **/

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.speed = 2200;

        HardDisk disk = new HardDisk();
        disk.amount = 200;

        PC pc = new PC();

        pc.setCpu(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
