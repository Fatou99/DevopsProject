package tn.devops.entities;

import javax.persistence.OneToMany;
import java.util.*;

public class Department {

    private int departmentId;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Student> students;

    @OneToMany(mappedBy = "department")
    private List<Teacher> teachers;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setId(int id) {
        this.departmentId = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String deptName) {
        this.name = deptName;
    }

    public Collection<Student> getStudents() {
        return (Collection<Student>) students;
    }

    public Collection<Teacher> getTeachers() {
        return (Collection<Teacher>) teachers;
    }


}

