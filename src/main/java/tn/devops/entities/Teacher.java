package tn.devops.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Teacher {
	
	private int teacherId;
    private String name;
    private String address;
    private String email;
    @ManyToOne
    private Department department;
    @OneToMany(mappedBy = "teacher")
    private Collection<Research> researches;


    public Teacher(String name, int age, String address, String email) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getTeacherName() {
        return name;
    }
    
	public String getTeacherAddress() {
        return address;
    }
    
	public String getTeacherEmail() {
        return email;
    }
    
	public int getTeacherId() {
        return teacherId;
    }
	
	public int getTeacherDepartment() {
        return department.getDepartmentId();
    }
	
	public void setTeacherName(String name) {
		this.name = name;
	}
	
	public void setTeacherEmail(String name) {
		this.name = name;
	}
	
	public void setTeacherAddress(String name) {
		this.name = name;
	}
	
	
    
    
    //Research 
    /*
    @ManyToOne
    @JoinColumn(name="teacher_id") : à vérifier
    private Teacher teacher;
    */
}
