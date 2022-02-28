package com.dida.pojo;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private  String name;
    private String pwd;

}
