package tn.devops.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.devops.entities.Group;


@Repository
public interface IGroupRepository extends CrudRepository<Group,Integer> {
}
