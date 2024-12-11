import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        int a, b;

        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();

        System.out.print("b = ");
        b = input.nextInt();

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.print("a = " + a + "\n" + "b = " + b);
        input.close();
    }
}
