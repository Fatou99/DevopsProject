package tn.devops;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.devops.entities.Department;
import tn.devops.services.DepartmentManagement;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Department.class)

public class TestDepartment {
	 	@Autowired
	    DepartmentManagement departmentService;

	    @Test
	    public void addDepartmentTest(){
	        Department d = new Department( "Informatique");
	        int departmentId = departmentService.addDepartment(d);
	        assertNotNull(departmentId);
	    }
	    //do we test the method in all its forms? if we had a lot of methods with different arguments
	    @Test
	    public void deleteDepartmentTest(){
	        Department d = new Department( "Physique");
	        int departmentId= departmentService.addDepartment(d);
	        departmentService.deleteDepartment(departmentId);
	        assertNull(departmentService.findDepartmentById(departmentId));
	    }

	   @Test
	    public void updateDepartmentNameTest(){
	        Department p = new Department( "Info Indus");
	        int departmentId=  departmentService.addDepartment(p);
	        String departmentName =  departmentService.updateDepartmentName( departmentId,"Informatique Industriel");
	        assertEquals(departmentName,"Info Indus");
	    }
}
