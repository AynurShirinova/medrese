package com.example.medrese.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionCategoryRepository extends JpaRepository<QuestionCategoryRepository, Integer> {
}