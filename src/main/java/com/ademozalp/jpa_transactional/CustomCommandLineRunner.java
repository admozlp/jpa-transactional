package com.ademozalp.jpa_transactional;

import com.ademozalp.jpa_transactional.service.PassportService;
import com.ademozalp.jpa_transactional.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class CustomCommandLineRunner implements CommandLineRunner {
    //private final PersonRepository personRepository;

    //private final PassportRepository passportRepository;
    private final PersonService personService;
    private final PassportService passportService;

    @Override
    public void run(String... args) throws Exception {


//        Person person = Person.builder()
//                .firstName("FirstName")
//                .lastName("LastName")
//                .build();
//
//
//        Passport passport = Passport.builder()
//                .no("passportno")
//                .person(person)
//                .build();
//
//        passportRepository.save(passport);

//        log.info("::: Person id: {}", personService.getById(1).getId());
        log.info("passport Id: {}", passportService.takePassport(1).getId());

    }
}
