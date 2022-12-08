package tn.devops.services.implementation;

        import java.util.List;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import tn.devops.entities.Course;
        import tn.devops.entities.Department;
        import tn.devops.repositories.CourseRepository;
        import tn.devops.repositories.DepartmentRepository;
        import tn.devops.services.ICourseService;

@Service
public class CourseService implements ICourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<Course> getAllcourses() {
        return (List<Course>) courseRepository.findAll();
    }


    public Course findCourseById(int id){

        Course c = courseRepository.findById(id).orElse(null);
        return c;

    }

    @Override
    public int addCourse(Course c) {
        courseRepository.save(c);
        return c.getCourseId();
    }

    @Override
    public Course editCourses(Course entity) {
        return courseRepository.save(entity);
    }

    @Override
    public void deleteCourses(Integer id) {
        courseRepository.deleteById(id);
    }
}