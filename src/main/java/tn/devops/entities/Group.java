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
    private int groupId;
    private String groupName;
    private int groupCapacity;
    @OneToMany(mappedBy="g")
    private List<Student> ls;

    public int getId(){
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName(){
        return groupName;
    }

    public int getCapacity(){
        return groupCapacity;
    }

    public void setName(String name){groupName=name;}
    public void setCapacity(int capacity){groupCapacity=capacity;}

    public Group(){}
}
