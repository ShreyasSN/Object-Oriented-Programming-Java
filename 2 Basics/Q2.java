import java.util.*;

public class Q2 {

    boolean IsPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int left, right;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start number : ");
        left = input.nextInt();
        System.out.print("Enter the end number : ");
        right = input.nextInt();
        input.close();

        Q2 q2 = new Q2();

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = left; i < right; i++) {
            boolean prime = q2.IsPrime(i);
            if (prime) {
                res.add(i);
            }
        }
        if (res.size() == 0) {
            System.out.print("No Prime Numbers");
            return;
        }

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
