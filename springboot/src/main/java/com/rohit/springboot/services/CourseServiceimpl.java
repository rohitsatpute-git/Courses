package com.rohit.springboot.services;

import com.rohit.springboot.Dao.CourseDao;
import com.rohit.springboot.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceimpl implements CourseService{
    
//   List<Course>list;
   @Autowired
   private CourseDao courseDao;
  

    // public CourseServiceimpl(){
    //    list =new ArrayList<>();
    //    list.add(new Course(145,"java core course","this course contain basics of java"));
    // }
    @Override
    public List<Course> getCourses(){
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
    //    Course c=null;
    //    for(Course course:list){
    //        if(course.getId()==courseId){
    //            c=course;
    //            break;
    //        }
    //    }
       return courseDao.findById(courseId).orElse(null);
        
    }

    @Override
    public List<Course> addCourse(Course course) {
    //    list.add(course);
    //    return course;
       
        courseDao.save(course);
         return courseDao.findAll();
    }
    
    @Override
    public  List<Course> updateCourse(Course course){
        Course c=courseDao.findById(course.getId()).orElse(null);
        c.setDescription(course.getDescription());
        c.setTitle(course.getTitle());
        courseDao.save(c);
        return courseDao.findAll();
    }

    @Override
    public List<Course> deleteCourse(long courseId) {
       
       
        courseDao.deleteById(courseId);
        return courseDao.findAll();
    }
}
