import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Eneter the num : ");
        num = input.nextInt();

        int resverse = 0;
        while (num != 0) {
            int digit = num % 10;
            resverse = resverse * 10 + digit;
            num /= 10;
        }

        System.out.print("Reversed Number : " + resverse);
        input.close();
    }
}
