package tn.devops.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
@Entity
public class Student extends Person implements Serializable {
@Id
private int studentId;
@ManyToOne
private  Group g;
    public Student(){super();}
    public Student(String name, int age, String address, String email) {
        super(name, age, address, email);
    }

    public int getId(){
        return studentId;
    }
}
