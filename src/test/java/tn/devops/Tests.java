package tn.devops;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.devops.entities.Course;
import tn.devops.entities.Department;
import tn.devops.services.implementation.CourseService;
import tn.devops.services.implementation.DepartmentService;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
public class Tests {


    @Autowired
    private CourseService courseService;

    // JUnit test for saveCourse

    @Test
    public void addCourseTest() {

        Course c = new Course(1, "Devops", 4);
        int courseId = courseService.addCourse(c);
        assertNotNull(courseId);
    }


    @Test


    public void updateCourseTest(){

        Course course = new Course(1,"Devops", 4);


        course.setCourseName("Engineering");

        Course courseUpdated =  courseService.editCourses(course);

        Assertions.assertThat(courseUpdated.getCourseName()).isEqualTo("Engineering");

    }

    @Test


    public void deleteCourseTest(){


        Course course = new Course(3,"Devops", 4);

        int courseId= courseService.addCourse(course);
        courseService.deleteCourses(courseId);
        assertNull(courseService.findCourseById(courseId));

    }

}
