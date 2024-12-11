import java.util.Scanner;

class Student {
    private String name;
    private String rollNumber;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCGPA(double cgpa) {
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
        return 9.5 * cgpa;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        Student[] students = new Student[numStudents];
        System.out.print("Student details: ");
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            
            String name = scanner.next();
            String rollNumber = scanner.next();
            double cgpa = scanner.nextDouble();
            
            students[i].setName(name);
            students[i].setRollNumber(rollNumber);
            students[i].setCGPA(cgpa);
        }

        for (Student student : students) {
            System.out.printf("%s %s %.1f %.1f%%\n",
                    student.getName(), student.getRollNumber(),
                    student.getCGPA(), student.calculatePercentage());
        }
        scanner.close();
    }
}
