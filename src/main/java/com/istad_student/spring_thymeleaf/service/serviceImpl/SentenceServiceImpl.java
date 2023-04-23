package com.istad_student.spring_thymeleaf.service.serviceImpl;

import com.istad_student.spring_thymeleaf.model.Sentences;
import com.istad_student.spring_thymeleaf.repository.SentenceRepository;
import com.istad_student.spring_thymeleaf.service.SentenceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentenceServiceImpl implements SentenceService {

    SentenceRepository sentenceRepository;
   SentenceServiceImpl(){
       sentenceRepository = new SentenceRepository();
   }
    @Override
    public List<Sentences> getAllSentence() {
        return sentenceRepository.getAllSentences();
    }

    @Override
    public Sentences getSentenceById(int id) {
        return sentenceRepository.getSentenceById(id);
    }

    @Override
    public void addNewSentence(Sentences sentences) {
        sentenceRepository.addNewSentence(sentences);
    }
}
