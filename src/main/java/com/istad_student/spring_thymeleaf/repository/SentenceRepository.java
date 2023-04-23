package com.istad_student.spring_thymeleaf.repository;

import com.istad_student.spring_thymeleaf.model.Sentences;

import java.util.ArrayList;
import java.util.List;

public class SentenceRepository {
    private List<Sentences> sentencesList = new ArrayList<>(){{
        add(new Sentences(1001, "C++"," A Language of programing","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgGk9eIajbGB-ONd5upUivvCC5UBZnBYTo0g&usqp=CAU",
          new EditorRepository().getAllEditors().get(0)));

        add(new Sentences(1002, "Java","A Language of programing","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBFDNExpUfZKx8pqnKG4r03eMXefDmMiOtuw&usqp=CAU",
                new EditorRepository().getAllEditors().get(3)));

        add(new Sentences(1003, "Spring","A Language of programing","https://i.pinimg.com/236x/64/e6/fc/64e6fc7311876af479cf621037fd9337.jpg",
                new EditorRepository().getAllEditors().get(1)));
    }};

    public List<Sentences> getAllSentences() {
        return sentencesList;
    }

    public Sentences getSentenceById(int id){
        return sentencesList.stream().filter(e-> e.getId()==id).findFirst().orElse(null);
    }
    public void addNewSentence(Sentences sentences){
        sentencesList.add(sentences);
    }
}
