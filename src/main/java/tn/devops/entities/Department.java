package tn.devops.entities;

import java.io.Serializable;
import java.util.List;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.persistence.OneToMany;


@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;
    private String deptName;
    @OneToMany(mappedBy = "dept")
    private List<Course> courses;

    public Department(int departmentIdId, String deptName) {
        this.departmentId = departmentIdId;
        this.deptName = deptName;
    }

    public Department() {

    }
    public int getDeptId(){
        return departmentId;
    }

    public String getDeptName(){
        return deptName;
    }

    public void setDepartmentId(int id) {
        this.departmentId = id;
    }

    public void setDepartmentName(String name) {
        this.deptName = name;
    }
}