package com.ademozalp.jpa_transactional.service;

import com.ademozalp.jpa_transactional.model.Person;
import com.ademozalp.jpa_transactional.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository repository;

    @Transactional(propagation = Propagation.REQUIRED)
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    @Transactional(propagation = Propagation.SUPPORTS)
//    @Transactional(propagation = Propagation.NOT_SUPPORTED)
//    @Transactional(propagation = Propagation.NEVER)
//    @Transactional(propagation = Propagation.MANDATORY)
    public Person getById(Integer personId) {
        return repository.findById(personId)
                .orElseThrow(() -> new RuntimeException("person not fount"));
    }
}
