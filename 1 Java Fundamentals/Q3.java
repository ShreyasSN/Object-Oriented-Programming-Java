import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        int count = 0, num;

        Scanner input = new Scanner(System.in);
        System.out.print("Eneter the number : ");
        num = input.nextInt();

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.print(count);
        input.close();

    }
}
