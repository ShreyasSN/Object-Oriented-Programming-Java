import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();
        input.close();

        long res = 0;

        for(int i=1; i<=num; i++){
            res += (long)i;
        }

        System.out.print(res);
    }
}
