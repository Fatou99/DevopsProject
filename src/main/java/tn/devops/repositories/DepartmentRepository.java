package tn.devops.repositories;


import org.springframework.data.repository.CrudRepository;
import tn.devops.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}