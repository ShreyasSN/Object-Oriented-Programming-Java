import java.util.*;

public class Q6 {

    public boolean ispalindrome(int num) {
        if (num < 0 || num % 10 == 0 && num != 0) {
            return false;
        }
        int reverted = 0;

        while (num > reverted) {
            reverted = reverted * 10 + num % 10;
            num /= 10;
        }
        return reverted == num || reverted/10 == num;
    }

    public static void main(String args[]) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();
        input.close();

        Q6 q6 = new Q6();
        boolean isPalindrome = q6.ispalindrome(num);
        System.out.println(isPalindrome ? "True" : "False");
    }
}
