package com.dida.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {


    private String author;
    private Date createTime;
    private Integer views;
    private String title;
    private String id;

}
