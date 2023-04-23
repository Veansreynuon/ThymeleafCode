package com.istad_student.spring_thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Editor {
    private int id;
    private String name;
    private String gender;
    private String bio;

}
