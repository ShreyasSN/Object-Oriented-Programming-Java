import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String numString = input.nextLine();
        String [] numsstrStrings = numString.split(" ");
        int [] nums = new int[numsstrStrings.length];

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<numsstrStrings.length; i++){
            nums[i] = Integer.parseInt(numsstrStrings[i]);
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] - nums[j] != nums[j] && mp.containsKey(nums[i] - nums[j])){
                    count++;
                }
            }
        }
        System.out.print(count);
        input.close();
    }
}
