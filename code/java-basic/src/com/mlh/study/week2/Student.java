package com.mlh.study.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author lh
 * @Date 2020/10/12
 **/
@Data
@AllArgsConstructor

public class Student {
    private String studentName;
    private String gender;
    private Phone[] phones;
    private Book[] books;
}
