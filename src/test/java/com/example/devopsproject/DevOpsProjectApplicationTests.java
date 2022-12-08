package com.example.devopsproject;

import org.junit.runner.RunWith;
import tn.devops.entities.Course;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import tn.devops.services.implementation.CourseService;
import tn.devops.services.implementation.DepartmentService;

import static org.junit.jupiter.api.Assertions.assertNull;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DevOpsProjectApplicationTests {
/*

	@Autowired
	private CourseService courseService;

	// JUnit test for saveCourse


	@Test
	@Order(1)
	public void getCoursesTest(){

		Course course = courseService.findCourseById(1);

		Assertions.assertThat(course.getCourseId()).isEqualTo(1);

	}

	@Test
	@Order(2)
	public void getListOfCoursesTest(){

		List<Course> courses = (List<Course>) courseService.getAllcourses();

		Assertions.assertThat(courses.size()).isGreaterThan(0);

	}

	@Test
	@Order(3)

	public void updateCourseTest(){

		Course course = courseService.findCourseById(1);

		course.setCourseName("Engineering");

		Course courseUpdated =  courseService.editCourses(course);

		Assertions.assertThat(courseUpdated.getCourseName()).isEqualTo("Engineering");

	}

	@Test
	@Order(4)

	public void deleteCourseTest(){

		Course course = courseService.findCourseById(1);

		courseService.deleteCourses(course.getCourseId());

		assertNull(courseService.findCourseById(course.getCourseId()));

	}
*/
}
