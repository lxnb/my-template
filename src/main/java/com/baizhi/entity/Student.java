package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private String name;
    private String password;
    private String email;
    private Date Bir;
    private List<Tests> list;
    private String city;
    private Integer id;
}
