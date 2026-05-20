package com.learnjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
