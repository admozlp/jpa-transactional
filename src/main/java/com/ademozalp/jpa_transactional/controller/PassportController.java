package com.ademozalp.jpa_transactional.controller;


import com.ademozalp.jpa_transactional.model.Passport;
import com.ademozalp.jpa_transactional.repository.PassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/passports")
@RequiredArgsConstructor
public class PassportController {

    private final PassportRepository passportRepository;

    @GetMapping
    public List<Passport> getAll() {
        List<Passport> all = passportRepository.findAll();
        System.out.println(all);
        return all;
    }
}
