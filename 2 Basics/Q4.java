import java.util.*;

public class Q4 {

    int BinarySearch(ArrayList<Integer> nums, int target) {
        int left = 0, right = nums.size();
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums.get(mid) == target) {
                return mid;
            } else if (nums.get(mid) > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int target;
        ArrayList<Integer> nums = new ArrayList<>();
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elelments : ");
        n = input.nextInt();
        System.out.println("Enter the " + n + " number of elements : ");
        for (int i = 0; i < n; i++) {
            int num;
            num = input.nextInt();
            nums.add(num);
        }
        System.out.print("Target : ");
        target = input.nextInt();
        input.close();

        Q4 q4 = new Q4();
        int index = q4.BinarySearch(nums, target);

        System.out.print(index);
    }
}
