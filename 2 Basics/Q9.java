import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        boolean isEqual = str1.equals(str2);

        System.out.println(isEqual ? "The strings are equal." : "The strings are not equal.");

        scanner.close();
    }
}
