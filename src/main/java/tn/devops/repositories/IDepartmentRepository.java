package tn.devops.repositories;
import tn.devops.entities.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IDepartmentRepository extends CrudRepository<Department, Integer> {
	}
