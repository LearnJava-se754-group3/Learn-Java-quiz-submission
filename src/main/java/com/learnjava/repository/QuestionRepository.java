package com.learnjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByLessonId(Long lessonId);
}
