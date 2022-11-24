package com.kodlamaio.springdevs.dao;

import com.kodlamaio.springdevs.model.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Integer> {
}
