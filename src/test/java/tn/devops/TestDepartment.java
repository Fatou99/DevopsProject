package tn.devops;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tn.devops.entities.Department;
import tn.devops.services.DepartmentManagement;
import static org.junit.jupiter.api.Assertions.*;
@ContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDepartment {
	 	@Autowired
	    DepartmentManagement departmentService;
		 @Test
		public void testTest() {
			// empty test that would fail if our Spring configuration does not load correctly
		}
//	    @Test
//	    public void addDepartmentTest(){
//	        Department d = new Department(1, "Informatique");
//	        int departmentId = departmentService.addDepartment(d);
//	        assertNotNull(departmentId);
//	    }
	    //do we test the method in all its forms? if we had a lot of methods with different arguments
//	    @Test
//	    public void deleteDepartmentTest(){
//	        Department d = new Department( "Physique");
//	        int departmentId= departmentService.addDepartment(d);
//	        departmentService.deleteDepartment(departmentId);
//	        assertNull(departmentService.findDepartmentById(departmentId));
//	    }
//
//	   @Test
//	    public void updateDepartmentNameTest(){
//	        Department p = new Department( "Info Indus");
//	        int departmentId=  departmentService.addDepartment(p);
//	        String departmentName =  departmentService.updateDepartmentName( departmentId,"Informatique Industriel");
//	        assertEquals(departmentName,"Info Indus");
//	    }
}
