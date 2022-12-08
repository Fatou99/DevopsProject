package tn.devops.services;
import tn.devops.entities.Department;

import java.util.List;

public interface IDepartmentService {

    // save operation
    Department saveDepartment(Department department);

    // read operation
    List<Department> fetchDepartmentList();

    // update operation
    Department updateDepartment(Department department, int departmentId);

    // delete operation
    void deleteDepartmentById(int departmentId);
}


