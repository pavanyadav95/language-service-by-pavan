package com.jarvis.language.repository;

import com.jarvis.language.entity.Language;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
    Language findByLanguage(String language);
}
