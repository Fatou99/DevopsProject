package tn.devops.services;

import tn.devops.entities.Course;

import java.util.List;

public interface ICourseService {


     List<Course> getAllcourses();
     int addCourse(Course course);
     Course editCourses(Course entity);
     void deleteCourses(Integer id);
}
