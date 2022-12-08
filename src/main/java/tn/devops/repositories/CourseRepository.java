package tn.devops.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.devops.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
    }


