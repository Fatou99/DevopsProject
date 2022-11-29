package tn.devops.services;

import org.springframework.stereotype.Service;
import tn.devops.entities.Person;
import tn.devops.entities.Student;

import java.util.List;

//@Service
public interface IPersonManagement {
    public int addPerson(Student p);
    public void deletePerson(int id);
    public String updatePersonEmail(int id, String email);
    public String updatePersonAddress(int id, String address);
    public String updatePersonName(int id, String name);
    public int updatePersonAge(int id, int age);
    public List<Student> getListPerson();
}
