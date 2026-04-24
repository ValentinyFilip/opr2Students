import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchoolSystem {
    private Set<Student> students = new HashSet<>();
    private Set<Course> courses = new HashSet<>();
    private List<Grade> grades = new ArrayList<>();

    public void addGrade(Student student, Course course, int value, Lecturer lecturer) {
        for (Grade g : grades) {
            if (g.getStudent().equals(student) && g.getCourse().equals(course)) {
                throw new RuntimeException("Student jiz znamku z tohoto kurzu ma!");
            }
        }
        grades.add(new Grade(value, lecturer, student, course));
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}