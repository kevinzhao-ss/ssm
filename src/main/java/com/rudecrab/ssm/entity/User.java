package com.rudecrab.ssm.entity;

import lombok.Data;

import java.io.Serializable;

@Data // lombok注解，自动生成Getter、Setter、toString方法
public class User implements Serializable {
    // 与数据库字段要一致
    private Long id;
    private String name;
    private String password;
}
