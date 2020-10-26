package com.mlh.study.week4;

/**
 * @ClassName OtherEmployee
 * @Description TODO
 * @Author lh
 * @Date 2020/10/26
 **/

public class OtherEmployee extends BaseEmployee{
    private String gender;
    public OtherEmployee() {
    }

    public OtherEmployee(String gender) {
        this.gender = gender;
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
