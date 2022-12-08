package tn.devops.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
    public class Course implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @ManyToOne
        private Department dept;
    private String courseName;
    private Integer coeff;


    public Course(int courseId, String courseName, int coeff) {
        this.id = courseId;
        this.courseName = courseName;
        this.coeff = coeff;


    }

    public Course() {

    }
    public int getCourseId(){
        return id;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCourseCoeff(){
        return coeff;
    }
    public void setDepartment(Department d) {
        this.dept = d;
    }
    public Department getDepartment() {
        return dept;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName ;
    }
}
