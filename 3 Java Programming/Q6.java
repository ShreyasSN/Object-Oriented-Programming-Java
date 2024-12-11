import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private String name;
    private String rollNumber;
    private double cgpa;

    public Student() {
    }

    public Student(String name, String rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public double getCGPA() {
        return cgpa;
    }


    public double calculatePercentage() {
        return Math.round(9.5 * cgpa * 1000)/ 1000.0;
    }

    @Override
    public String toString() {
        return name + " " + rollNumber + " " + cgpa + " " + calculatePercentage() + " %";
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        ArrayList<Student> students = new ArrayList<Student>();
        
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); 
            System.out.println("Enter Student Details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            String rollNumber = scanner.next();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            students.add(new Student(name, rollNumber, cgpa));
        }
        
        System.out.println("Sample Output:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
