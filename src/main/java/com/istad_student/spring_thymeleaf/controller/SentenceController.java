package com.istad_student.spring_thymeleaf.controller;

import com.istad_student.spring_thymeleaf.model.Editor;
import com.istad_student.spring_thymeleaf.model.Sentences;
import com.istad_student.spring_thymeleaf.model.request.SentenceRequest;
import com.istad_student.spring_thymeleaf.service.EditorService;
import com.istad_student.spring_thymeleaf.service.SentenceService;
import com.istad_student.spring_thymeleaf.service.serviceImpl.SentenceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Comparator;

@Controller
public class SentenceController {
//    inject dependency throw constructor
    SentenceService sentenceService;
    EditorService editorService;
    @Autowired
    SentenceController(SentenceService sentenceService, EditorService editorService){
        this.sentenceService = sentenceService;
        this.editorService = editorService;
    }

// To pull data from service use Model(from interface)
    @GetMapping("/allSentences")
    public String getAllSentence(Model model){
    model.addAttribute("allSentence",sentenceService.getAllSentence());
        return "allSentences";
    }

    @GetMapping("/post/{postId}")
    public String getPostById(@PathVariable int postId, Model model){
        model.addAttribute("sentence",sentenceService.getSentenceById(postId));
        model.addAttribute("editors");
//        System.out.println("Here is the postId : "+postId);
        return "viewSentence";
    }

    @GetMapping("/formAddSentence")
    public String getFormAdd(Model model){
        model.addAttribute("sentence", new SentenceRequest());
        model.addAttribute("editors", editorService.getAllEditors());
        return "newSentence";
    }

    @PostMapping("/handleAddSentence")
    public String handleAddSentence(@ModelAttribute("sentence") SentenceRequest sentences){
        System.out.println("Here is the value of sentence : "+sentences);
//        mapstruct vs model mapper
        Sentences newSentences = new Sentences();
        newSentences.setTitle(sentences.getTitle());
        newSentences.setDescription(sentences.getDescription());
        newSentences.setImgUrl(sentences.getImgUrl());
        newSentences.setEditor (editorService.getAllEditors().stream().filter(e-> e.getId()== sentences.getEditorId()).findFirst().orElse(null));
// use stream find max by id
      newSentences.setId(sentenceService.getAllSentence().stream().max(Comparator.comparingInt(Sentences::getId)).stream().toList().get(0).getId()+1);
        sentenceService.addNewSentence(newSentences);
        return "redirect:/";
    }

}
