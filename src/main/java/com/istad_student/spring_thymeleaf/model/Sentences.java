package com.istad_student.spring_thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sentences {
    private int id;
    private String title;
    private  String description;
    private String imgUrl;
    private Editor editor;
}
