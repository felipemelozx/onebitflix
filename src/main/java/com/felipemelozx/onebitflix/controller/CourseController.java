package com.felipemelozx.onebitflix.controller;

import com.felipemelozx.onebitflix.entity.Course;
import com.felipemelozx.onebitflix.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

  private final CourseService courseService;

  public CourseController(CourseService courseService) {
    this.courseService = courseService;
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Course> findByIdWithEpisodes(@PathVariable Integer id){
    Course course = courseService.findById(id);
    return ResponseEntity.ok(course);
  }
}
