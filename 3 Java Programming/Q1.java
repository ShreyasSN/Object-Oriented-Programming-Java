import java.util.*;
public class Q1 {
    public static void main(String args[]) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();

        System.out.println("Enter the Numbers: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        Set<Integer> resSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            resSet.add(nums[i]);
        }
        System.out.print("Original Size : " + n + "\n");
        System.out.print("After removing duplicates, the new length of the array is: " + resSet.size());
        input.close();
    }
}
