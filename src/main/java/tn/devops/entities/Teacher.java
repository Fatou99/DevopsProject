package tn.devops.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Teacher extends Person{

    public Teacher(String name, int age, String address, String email) {
        super(name, age, address, email);
    }

    @OneToMany(mappedBy = "teacher")
    private Collection<Research> researches;

    //Research 
    /*
    @ManyToOne
    @JoinColumn(name="teacher_id") : à vérifier
    private Teacher teacher;
    */
}
