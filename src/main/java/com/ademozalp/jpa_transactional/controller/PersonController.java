package com.ademozalp.jpa_transactional.controller;

import com.ademozalp.jpa_transactional.model.Person;
import com.ademozalp.jpa_transactional.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping
    public List<Person> getAll() {
        List<Person> all = personRepository.findAll();
        System.out.println(all);
        return all;
    }
}
