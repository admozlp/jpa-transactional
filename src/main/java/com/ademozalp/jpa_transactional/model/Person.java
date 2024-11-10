package com.ademozalp.jpa_transactional.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.EAGER;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "person", fetch = EAGER, cascade = ALL)
    @Builder.Default
    private List<Passport> passports = new ArrayList<>();
}
