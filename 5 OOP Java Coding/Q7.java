import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int negate(int num) {
        return -num;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int choice;
        do {
            System.out.println("1. Add two numbers");
            System.out.println("2. Add three numbers");
            System.out.println("3. -1 * number");
            System.out.println("4. Exit");
            System.out.println("*****");

            System.out.print("Enter option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter 2 numbers: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int sum2 = calculator.add(num1, num2);
                    System.out.println("Sum is " + sum2);
                    break;

                case 2:
                    System.out.print("Enter 3 numbers: ");
                    int num3 = scanner.nextInt();
                    int num4 = scanner.nextInt();
                    int num5 = scanner.nextInt();
                    int sum3 = calculator.add(num3, num4, num5);
                    System.out.println("Sum is " + sum3);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int num6 = scanner.nextInt();
                    int negated = calculator.negate(num6);
                    System.out.println("-1 * " + num6 + " = " + negated);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            System.out.println("*****");

        } while (choice != 4);

        scanner.close();
    }
}
