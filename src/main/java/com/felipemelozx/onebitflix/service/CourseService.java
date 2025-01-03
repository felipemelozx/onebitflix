package com.felipemelozx.onebitflix.service;

import com.felipemelozx.onebitflix.entity.Course;
import com.felipemelozx.onebitflix.repository.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

  private final CourseRepository courseRepository;

  public CourseService(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  public Course findById(Integer id) {
    return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found!"));
  }
}
