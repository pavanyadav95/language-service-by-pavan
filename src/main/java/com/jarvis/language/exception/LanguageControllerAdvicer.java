package com.jarvis.language.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class LanguageControllerAdvicer {

    @ExceptionHandler(LanguageDuplicationException.class)
    public ResponseEntity<Object> handleLanguageDuplicationException(LanguageDuplicationException e, WebRequest webRequest) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", e.getMessage());
        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }
}
