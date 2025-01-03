package com.felipemelozx.onebitflix.repository;

import com.felipemelozx.onebitflix.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}