package com.istad_student.spring_thymeleaf.repository;

import com.istad_student.spring_thymeleaf.model.Editor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EditorRepository {
    List<Editor> editors = new ArrayList<>(){{
        add(new Editor(001, "Marisa", "Female", "Everything will be better"));
        add(new Editor(002, "Daliza", "Female", "Everything will be better"));
        add(new Editor(003, "Nisa", "Female", "Everything will be better"));
        add(new Editor(004, "Lina", "Female", "Everything will be better"));
    }};

    public List<Editor> getAllEditors() {
        return editors;
    }

}
