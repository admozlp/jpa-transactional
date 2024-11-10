package com.ademozalp.jpa_transactional.service;

import com.ademozalp.jpa_transactional.converter.PassportConverter;
import com.ademozalp.jpa_transactional.dto.passport.response.PassportResponse;
import com.ademozalp.jpa_transactional.exception.CustomException;
import com.ademozalp.jpa_transactional.model.Passport;
import com.ademozalp.jpa_transactional.model.Person;
import com.ademozalp.jpa_transactional.repository.PassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PassportService {
    private final PassportRepository repository;
    private final PersonService personService;

    @Transactional(rollbackFor = FileNotFoundException.class, noRollbackFor = CustomException.class)
    public PassportResponse takePassport(Integer personId) throws FileNotFoundException {
        Person person = personService.getById(personId);

        Passport passport = Passport.builder()
                .no(person.getFirstName().toUpperCase() + UUID.randomUUID())
                .person(person)
                .build();

        repository.save(passport);


        return PassportConverter.toResponse(passport);
//        throw new CustomException("exception");
//        throw new FileNotFoundException("exception");
    }

}
