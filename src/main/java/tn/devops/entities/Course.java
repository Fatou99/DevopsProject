package tn.devops.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Course implements Serializable {
    @Id
    private int courseId;
    private String name;
    public Course(){

    }
    public int getId(){return courseId;}

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
