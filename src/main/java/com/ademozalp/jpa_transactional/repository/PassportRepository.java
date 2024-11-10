package com.ademozalp.jpa_transactional.repository;

import com.ademozalp.jpa_transactional.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
