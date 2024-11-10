package com.ademozalp.jpa_transactional.repository;

import com.ademozalp.jpa_transactional.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
