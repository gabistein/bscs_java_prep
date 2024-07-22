import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/StudentData.csv");
        Student[] students = readData(file);

        String shortestFirstName = findShortestFirstName(students);
        double averageGpa = calculateAverageGpa(students);

        System.out.println("First student: " + students[0]);
        System.out.println("Last student: " + students[students.length - 1]);
        System.out.println("Shortest first name: " + shortestFirstName);
        System.out.println("Average GPA: " + String.format("%.1f", averageGpa));
    }

    public static Student[] readData(File file) throws Exception {
        Scanner scanner = new Scanner(file);
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Skip the line for number of students
        scanner.nextLine(); // Skip the header line
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            String line = scanner.nextLine();
            String[] data = line.split(",");
            students[i] = new Student(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
        }
        scanner.close();

        return students;
    }

    public static String findShortestFirstName(Student[] students) {
        String shortestFirstName = students[0].getFirstName();
        for (Student student : students) {
            if (student.getFirstName().length() < shortestFirstName.length()) {
                shortestFirstName = student.getFirstName();
            }
        }
        return shortestFirstName;
    }

    public static double calculateAverageGpa(Student[] students) {
        double totalGpa = 0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }
        return totalGpa / students.length;
    }
}
