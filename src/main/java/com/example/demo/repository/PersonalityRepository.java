package com.example.demo.repository;

import com.example.demo.model.Personality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalityRepository extends JpaRepository<Personality,Integer> {
}
