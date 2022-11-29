package com.example.devopsproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.devops.entities.Person;
import tn.devops.entities.Student;
import tn.devops.services.GroupManagement;
import tn.devops.services.PersonManagement;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DevOpsProjectApplicationTests {

	@Autowired
	PersonManagement personService;

	@Autowired
	GroupManagement groupService;

	//@Test
	//void contextLoads() {
	//}

	@Test
	public void addPersonTest(){
		Student p = new Student( "chandler bing", 20, "15 yemen road, yemen", "chandler@bing.com");
		int personId= personService.addPerson(p);
		assertNotNull(personId);
	}
//do we test the method in all its forms? if we had a lot of methods with different arguments
	@Test
	public void deletePersonTest(){
		Student p = new Student( "chandler bing", 20, "15 yemen road, yemen", "chandler@bing.com");
		int personId= personService.addPerson(p);
		personService.deletePerson(personId);
		assertNull(personService.findPersonById(personId));
	}

	@Test
	public void updatePersonAgeTest(){
		Student p = new Student( "chandler bing", 20, "15 yemen road, yemen", "chandler@bing.com");
		int personId= personService.addPerson(p);
		int personAge= personService.updatePersonAge(personId,16);
		assertEquals(personAge,16);
	}

}
