package tn.devops.entities;
@Entity
public class Teacher extends Person{

    public Teacher(String name, int age, String address, String email) {
        super(name, age, address, email);
    }

    @OneToMany(mappedBy = "teacher")
    private List<Research> researches;

    //Research 
    /*
    @ManyToOne
    @JoinColumn(name="teacher_id") : à vérifier
    private Teacher teacher;
    */
}
