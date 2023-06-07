package com.rohit.springboot.controller;

import com.rohit.springboot.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.rohit.springboot.entities.Course;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to courses applicatoin";
    }
    // get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
    return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
    return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public List<Course> addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public List<Course> updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public List<Course> deleteCourse(@PathVariable String courseId) {
        return this.courseService.deleteCourse(Long.parseLong((courseId)));
    }

}
