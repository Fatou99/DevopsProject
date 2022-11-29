package tn.devops.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.devops.entities.Person;
import tn.devops.entities.Student;


@Repository
//public interface IStudentRepository extends CrudRepository <Student, Integer>
public interface IStudentRepository extends CrudRepository <Student, Integer>
{

}