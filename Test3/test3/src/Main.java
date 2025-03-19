import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        String inputFile = "C:\\Users\\dachi\\Desktop\\Test3\\test3\\src\\students"; // Change this to your actual path
        String outputFile = "students.dat";

        List<Student> students = readStudentsFromFile(inputFile);
        serializeStudents(students, outputFile);
        List<Student> deserializedStudents = deserializeStudents(outputFile);


        deserializedStudents.sort(Comparator.comparingDouble(student -> student.avgScore));


        printStudents(deserializedStudents);
    }

    private static List<Student> readStudentsFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                String firstName = parts[1].trim();
                String lastName = parts[2].trim();
                int year = Integer.parseInt(parts[3].trim());
                double avgScore = Double.parseDouble(parts[4].trim());
                List<String> subjects = Arrays.asList(parts[5].trim().split(" "));
                students.add(new Student(id, firstName, lastName, year, avgScore, subjects));
            }
        } catch (IOException e) {
            System.err.println("Error reading file    : " + e.getMessage());
        }
        return students;
    }

    private static void serializeStudents(List<Student> students, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.err.println("Erro r serializing students    : " + e.getMessage());
        }
    }

    private static List<Student> deserializeStudents(String fileName) {
        List<Student> students = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erorr deserializing student s : " + e.getMessage());
        }
        return students;
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
