package tn.devops.entities;
@Entity
public class Research{

    public Research(String title, String topic) {
        this.title = title;
        this.topic = topic;
    }

    @ManyToOne
    @JoinColumn(name="teacher_id") //: à vérifier
    private Teacher teacher;
    
}
