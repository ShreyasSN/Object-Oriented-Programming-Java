import java.util.*;
import java.io.*;
public class Q5 {
    public static void main(String[] args) throws IOException {
        String details;
        System.out.print("Enter Details of inmate : ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        details = input.readLine();

        int no_days;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        no_days = in.nextInt();

        String[] words = details.trim().split("\\s+");

        int n = words.length;
        int res = 0;
        if (words[n - 1].equals("nonveg")) {
            res = (no_days * 120) + ((no_days * 120) * 5 / 100);
        } else if (words[n - 1].equals("veg")) {
            res = (no_days * 100) + ((no_days * 100) * 5 / 100);
        }

        System.out.print(res);

        input.close();
        in.close();
    }
}
