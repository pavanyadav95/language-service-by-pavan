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

    public Language saveLanguage(Language language) {
        return languageRepository.save(language);
    }

    public Optional<Language> getLanguage(Long languageId) {
        return languageRepository.findById(languageId);
    }

    public boolean checkLanguageExistence(String language) {
        if (languageRepository.findByLanguage(language) != null) {
            return true;
        }
        return false;
    }
}
