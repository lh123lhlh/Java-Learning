package com.mlh.study.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseEmployeeTest {

    @Test
    public void print() {
    }

    @Test
    public void getSalary() {
        //上转行对象
        BaseEmployee be = new MarketEmployee("admin");
        assertEquals(3000,be.getSalary());

    }
}