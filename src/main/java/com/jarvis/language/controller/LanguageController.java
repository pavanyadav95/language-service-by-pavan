package com.jarvis.language.controller;

import com.jarvis.language.entity.Language;
import com.jarvis.language.service.LanguageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguageService  languageService;

    @PostMapping("/save")
    public Language saveLanguage(@RequestBody Language language){
        return languageService.saveLaguage(language);
    }

    @GetMapping("/{id}")
    public Optional<Language> getLanguage(@PathVariable("id") Long languageId){
        return languageService.getLanguage(languageId);
    }
}
