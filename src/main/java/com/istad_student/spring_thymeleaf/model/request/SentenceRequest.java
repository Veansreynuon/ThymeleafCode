package com.istad_student.spring_thymeleaf.model.request;

import com.istad_student.spring_thymeleaf.model.Editor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SentenceRequest {
    private String title;
    private  String description;
    private String imgUrl;
    private int editorId;
}
