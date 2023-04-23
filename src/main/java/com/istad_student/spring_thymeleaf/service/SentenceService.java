package com.istad_student.spring_thymeleaf.service;

import com.istad_student.spring_thymeleaf.model.Sentences;

import java.util.ArrayList;
import java.util.List;

public interface SentenceService {
    List<Sentences> getAllSentence ();
    Sentences getSentenceById(int id);
    void addNewSentence(Sentences sentences);
}
