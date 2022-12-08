package tn.devops.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.devops.repository.ITeacherRepository;
import tn.devops.entities.Teacher;
import java.util.List;
import java.util.Optional;
@Service
public class TeacherManagement implements ITeacherManagement{
    @Autowired
    ITeacherRepository repo;
    @Override
    public int addTeacher(Teacher t) {
        repo.save(t);
        return t.getId();
    }

    @Override
    public void deleteTeacher(int id) {
        repo.deleteById(id);
    }

    @Override
    public String updateTeacherEmail(int id, String email) {
        try {
            Teacher t = repo.findById(id).orElse(null);
            t.setEmail(email);
            repo.save(t);
            return t.getEmail();
        } catch(NullPointerException e) {
            System.out.println("NullPointerException thrown! No teacher found.");
        }
        return ("no teacher found");
    }

    @Override
    public String updateTeacherAddress(int id, String address) {
        try {
            Teacher t = repo.findById(id).orElse(null);
            t.setAddress(address);
            repo.save(t);
            return t.getAddress();
        } catch(NullPointerException e) {
            System.out.println("NullPointerException thrown! No teacher found.");
        }
        return ("no teacher found");
    }

    @Override
    public String updateTeacherName(int id, String name) {
        try {
            Teacher t = repo.findById(id).orElse(null);
            t.setName(name);
            repo.save(t);
            return t.getName();
        } catch(NullPointerException e) {
            System.out.println("NullPointerException thrown! No teacher found.");
        }
        return ("no teacher found");
    }

    @Override
    public int updateTeacherAge(int id, int age) {
        try {
            Teacher t = repo.findById(id).orElse(null);
            t.setAge(age);
            repo.save(t);
            return t.getAge();
        } catch(NullPointerException e) {
            System.out.println("NullPointerException thrown! No teacher found.");
        }
        return (0);
    }
    @Override
    public Teacher findTeacherId(int id){
        try {
            Teacher t = repo.findById(id).orElse(null);
            return t;
        } catch(NullPointerException e) {
            System.out.println("NullPointerException thrown! No teacher found.");
        }
        Teacher t0 = new Teacher();
        return (t0);
    }
    @Override
    public List<Teacher> getListTeacher() {
        return null;
    }
}
