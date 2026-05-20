package com.learnjava.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.model.UserProgress;

public interface UserProgressRepository extends JpaRepository<UserProgress, Long> {

    Optional<UserProgress> findByUserIdAndLessonId(String userId, Long lessonId);

    long countByUserIdAndCompletedTrue(String userId);
}
