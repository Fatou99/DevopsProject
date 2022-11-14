package tn.devops.entities;

import javax.persistence.Entity;
import java.io.Serializable;
@Entity
public class Student extends Person implements Serializable {

    public Student(String name, int age, String address, String email) {
        super(name, age, address, email);
    }


}
