package com.rohit.springboot.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.rohit.springboot.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{
    
}
