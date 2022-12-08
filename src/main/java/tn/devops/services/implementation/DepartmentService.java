package tn.devops.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import tn.devops.entities.Department;

import tn.devops.repositories.DepartmentRepository;
import tn.devops.services.IDepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentService implements IDepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    // save operation
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // read operation
    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>) departmentRepository.findAll();
    }

    // update operation
    @Override
    public Department updateDepartment(Department department, int departmentId) {
        Department depDB = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDeptName()) && !"".equalsIgnoreCase(department.getDeptName())) {
            depDB.setDepartmentName(department.getDeptName());
        }

        return departmentRepository.save(depDB);
    }

    // delete operation
    @Override
    public void deleteDepartmentById(int departmentId) {
        departmentRepository.deleteById(departmentId);
    }

}