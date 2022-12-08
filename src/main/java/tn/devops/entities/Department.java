package tn.devops.entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Department {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
     @Column
    private String name;
    
    @OneToOne(mappedBy = "teacher")
    private Teacher head;

    @OneToMany(mappedBy = "department")
    private List<Student> students;

    @OneToMany(mappedBy = "department")
    private List<Teacher> teachers;
    
    public Department (int id, String name) {
    	this.departmentId = id;
        this.name = name;
    }

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

