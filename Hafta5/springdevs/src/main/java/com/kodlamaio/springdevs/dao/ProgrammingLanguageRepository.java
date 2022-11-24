package com.kodlamaio.springdevs.dao;

import com.kodlamaio.springdevs.model.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
