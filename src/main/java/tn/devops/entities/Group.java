package tn.devops.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Group implements Serializable {
    @Id
    private int GroupId;
    private String groupName;
    private int groupCapacity;
    @OneToMany(mappedBy="ls")
    private List<Student> ls;

    public int getId(){
        return GroupId;
    }

    public String getName(){
        return groupName;
    }

    public int getCapacity(){
        return groupCapacity;
    }
}
