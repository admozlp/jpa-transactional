package com.ademozalp.jpa_transactional.dto.passport.response;

import com.ademozalp.jpa_transactional.dto.person.response.PersonResponse;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PassportResponse {

    private Integer id;

    private String no;

    private PersonResponse person;
}
