package com.mlh.study.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Group
 * @Description TODO
 * @Author lh
 * @Date 2020/10/12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private String GroupNumber;
    private Student[] students;


}
