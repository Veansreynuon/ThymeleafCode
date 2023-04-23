package com.istad_student.spring_thymeleaf.service.serviceImpl;

import com.istad_student.spring_thymeleaf.model.Editor;
import com.istad_student.spring_thymeleaf.repository.EditorRepository;
import com.istad_student.spring_thymeleaf.service.EditorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorServiceImpl implements EditorService {

    private EditorRepository editorRepository;

    EditorServiceImpl(){
        editorRepository = new EditorRepository();
    }
    @Override
    public List<Editor> getAllEditors() {
        return editorRepository.getAllEditors();
    }
}
