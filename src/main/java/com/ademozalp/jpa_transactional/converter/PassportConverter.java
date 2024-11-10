package com.ademozalp.jpa_transactional.converter;

import com.ademozalp.jpa_transactional.dto.passport.response.PassportResponse;
import com.ademozalp.jpa_transactional.model.Passport;

public class PassportConverter {
    private PassportConverter() {
    }

    public static PassportResponse toResponse(Passport passport) {
        return PassportResponse.builder()
                .id(passport.getId())
                .no(passport.getNo())
                .person(PersonConverter.toResponse(passport.getPerson()))
                .build();
    }
}
