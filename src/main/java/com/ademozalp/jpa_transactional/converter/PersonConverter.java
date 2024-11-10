package com.ademozalp.jpa_transactional.converter;

import com.ademozalp.jpa_transactional.dto.person.response.PersonResponse;
import com.ademozalp.jpa_transactional.model.Person;

public class PersonConverter {
    private PersonConverter() {
    }


    public static PersonResponse toResponse(Person person) {
        return PersonResponse.builder()
                .id(person.getId())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .build();
    }
}
