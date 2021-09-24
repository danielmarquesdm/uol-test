package com.example.backend.repository;

import com.example.backend.model.Responsavel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMDayRepository extends JpaRepository<Responsavel, Integer> {
}
