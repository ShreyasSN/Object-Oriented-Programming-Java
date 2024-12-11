import java.util.*;

public class Q7 {

    static int FibonacciSeries(int n) {
        if (n <= 1)
            return n;

        return FibonacciSeries(n - 1) + FibonacciSeries(n - 2);
    }

    public static void main(String args[]) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(FibonacciSeries(i) + " ");
        }
        input.close();
    }
}