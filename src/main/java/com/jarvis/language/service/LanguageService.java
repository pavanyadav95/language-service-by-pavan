package com.jarvis.language.service;

import com.jarvis.language.entity.Language;
import com.jarvis.language.repository.LanguageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public Language saveLaguage(Language language) {
        return languageRepository.save(language);
    }

    public Optional<Language> getLanguage(Long languageId) {
        return languageRepository.findById(languageId);
    }
}
