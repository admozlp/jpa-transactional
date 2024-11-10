package com.ademozalp.jpa_transactional.dto.person.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonResponse {

    private Integer id;

    private String firstName;

    private String lastName;
}
