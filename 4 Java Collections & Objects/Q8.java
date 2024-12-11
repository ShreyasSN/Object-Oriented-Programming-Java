import java.util.*;

class Student {
    private String studentName;
    private int rollNo;
    private int englishScore;
    private int hindiScore;
    private int mathsScore;
    private int scienceScore;
    private int ssScore;

    public Student(String studentName, int rollNo, int englishScore, int hindiScore, int mathsScore, int scienceScore, int ssScore) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.englishScore = englishScore;
        this.hindiScore = hindiScore;
        this.mathsScore = mathsScore;
        this.scienceScore = scienceScore;
        this.ssScore = ssScore;
    }

    public int getTotalMarks() {
        return englishScore + hindiScore + mathsScore + scienceScore + ssScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getSubjectScore(int subjectCode) {
        switch (subjectCode) {
            case 101:
                return englishScore;
            case 102:
                return hindiScore;
            case 103:
                return mathsScore;
            case 104:
                return scienceScore;
            case 105:
                return ssScore;
            default:
                return 0;
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            char operation = scanner.nextLine().charAt(0);

            if (operation == 't') {
                break;
            }

            switch (operation) {
                case 'a':
                    String[] details = scanner.nextLine().split(" ");
                    String studentName = details[0];
                    int rollNo = Integer.parseInt(details[1]);
                    int englishScore = Integer.parseInt(details[2]);
                    int hindiScore = Integer.parseInt(details[3]);
                    int mathsScore = Integer.parseInt(details[4]);
                    int scienceScore = Integer.parseInt(details[5]);
                    int ssScore = Integer.parseInt(details[6]);
                    students.add(new Student(studentName, rollNo, englishScore, hindiScore, mathsScore, scienceScore,
                            ssScore));
                    break;

                case 's':
                    int subjectCode = Integer.parseInt(scanner.nextLine());
                    int maxScore = -1;
                    for (Student student : students) {
                        int score = student.getSubjectScore(subjectCode);
                        if (score > maxScore) {
                            maxScore = score;
                        }
                    }
                    for (Student student : students) {
                        if (student.getSubjectScore(subjectCode) == maxScore) {
                            System.out.println(student.getStudentName() + " " + student.getRollNo());
                        }
                    }
                    break;

                case 'c':
                    int maxTotalMarks = -1;
                    for (Student student : students) {
                        int totalMarks = student.getTotalMarks();
                        if (totalMarks > maxTotalMarks) {
                            maxTotalMarks = totalMarks;
                        }
                    }
                    for (Student student : students) {
                        if (student.getTotalMarks() == maxTotalMarks) {
                            System.out.println(student.getStudentName() + " " + student.getRollNo());
                        }
                    }
                    break;
            }
        }

        scanner.close();
    }
}