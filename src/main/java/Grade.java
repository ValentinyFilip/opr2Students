import java.time.LocalDateTime;

public class Grade {
    private int value;
    private LocalDateTime dateAdded;
    private Lecturer lecturer;
    private Student student;
    private Course course;

    public Grade(int value, Lecturer lecturer, Student student, Course course) {
        this.value = value;
        this.lecturer = lecturer;
        this.student = student;
        this.course = course;
        this.dateAdded = LocalDateTime.now();
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}