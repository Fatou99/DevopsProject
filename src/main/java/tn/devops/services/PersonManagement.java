package tn.devops.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.devops.entities.Person;
import tn.devops.entities.Student;
import tn.devops.repository.IStudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonManagement implements IPersonManagement {
    @Autowired
    IStudentRepository repo;

    @Override
    public int addPerson(Student p) {
        repo.save(p);
        return p.getId();
    }

    @Override
    public void deletePerson(int id) {
        repo.deleteById(id);
    }

    @Override
    public String updatePersonEmail(int id, String email) {
        Student p = repo.findById(id).orElse(null);
        p.setEmail(email);
        repo.save(p);
        return p.getEmail();
    }


    public Student findPersonById(int id){

           Student p = repo.findById(id).orElse(null);
           return p;

    }

    @Override
    public int updatePersonAge(int id, int age) {
        Student p = repo.findById(id).orElse(null);
        p.setAge(age);
        repo.save(p);
        return p.getAge();
    }

    @Override
    public String updatePersonAddress(int id, String address) {
        Student p = repo.findById(id).orElse(null);
        p.setAddress(address);
        repo.save(p);
        return p.getAddress();
    }

    @Override
    public String updatePersonName(int id, String name) {
        Student p = repo.findById(id).orElse(null);
        p.setName(name);
        repo.save(p);
        return p.getName();
    }

    @Override
    public List<Student> getListPerson() {
        return null;
    }


}
