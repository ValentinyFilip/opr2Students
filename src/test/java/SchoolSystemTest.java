import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SchoolSystemTest {
    private SchoolSystem system;
    private Student student;
    private Course course;
    private Lecturer lecturer;

    @BeforeEach
    void setUp() {
        system = new SchoolSystem();
        student = new Student("R12345");
        course = new Course("PRG1", "Programovani 1");
        lecturer = new Lecturer("Valentíny");
    }

    @Test
    void testAddGradeSuccessfully() {
        system.addGrade(student, course, 1, lecturer);

        assertEquals(1, system.getGrades().size());
    }

    @Test
    void testDuplicateGradeThrowsException() {
        system.addGrade(student, course, 1, lecturer);

        assertThrows(RuntimeException.class, () -> {
            system.addGrade(student, course, 2, lecturer);
        });

        assertEquals(1, system.getGrades().size());
    }
}