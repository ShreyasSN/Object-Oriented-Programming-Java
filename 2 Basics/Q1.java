import java.util.*;

public class Q1 {

    public boolean PalindromeCheck(int num) {
        int reverted = 0;
        if (num < 0 || num % 10 == 0 && num != 0) {
            return false;
        }
        while (num > reverted) {
            reverted = reverted * 10 + num % 10;
            num /= 10;
        }
        return reverted == num || reverted / 10 == num;
    }

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();
        input.close();

        Q1 q1 = new Q1();
        boolean Palindrome = q1.PalindromeCheck(num);
        System.out.print(Palindrome ? "True" : "False");
    }
}
