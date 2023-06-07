package com.rohit.springboot.services;
import java.util.List;
import com.rohit.springboot.entities.Course;
public interface CourseService {
    public List<Course> getCourses();

   public Course getCourse(long courseId);

   public List<Course> addCourse(Course course);

   public List<Course> updateCourse(Course course);

   public List<Course> deleteCourse(long courseId);
}
