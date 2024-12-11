import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        int base, exponent;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the number : ");
        base = input.nextInt();
        System.out.print("Enter the exponent : ");
        exponent = input.nextInt();
        int res = 1;
        while (exponent != 0) {
            res = res * base;
            exponent--;
        }
        System.out.println(res);
        input.close();

    }
}