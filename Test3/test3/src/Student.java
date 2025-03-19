import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    double avgScore; // Changed from gpa to avgScore
    private List<String> subjects;

    public Student(int id, String firstName, String lastName, int year, double avgScore, List<String> subjects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.avgScore = avgScore;
        this.subjects = subjects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, avgScore);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return id == other.id &&
                subjects.containsAll(other.subjects) &&
                other.subjects.containsAll(subjects);
    }

    @Override
    public String toString() {
        return "Student: {\n" +
                "id: " + id + ",\n" +
                "firstName: '" + firstName + "',\n" +
                "lastName: '" + lastName + "',\n" +
                "year: " + year + ",\n" +
                "avgScore: " + avgScore + ",\n" +
                "subjects: {\n" +
                String.join(",\n", subjects) + "\n" +
                "}\n" +
                "}";
    }
}
