package tn.devops.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.devops.entities.Department;
import tn.devops.repositories.IDepartmentRepository;


@Service
public class DepartmentManagement implements IDepartmentManagement{
	@Autowired
    IDepartmentRepository repo;

    @Override
    public int addDepartment(Department d){
        repo.save(d);
        return d.getDepartmentId();
    }
//    public void deleteDepartment(int departmentId){
//        repo.deleteById((departmentId));
//    }
//    public String updateDepartmentName(int id, String name){
//        Department d = repo.findById(id).orElse(null);
//        d.setName(name);
//        repo.save(d);
//        return  d.getName();
//    }
    
    public Department findDepartmentById(int id){

        Department d = repo.findById( id).orElse(null);
        return d;

 }
	
}
