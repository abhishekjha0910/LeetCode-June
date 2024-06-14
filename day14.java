import java.util.Arrays;

public class day14 {
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int numTracker = 0; 
        int minIncrement = 0; 

        for (int num : nums) {
            numTracker = Math.max(numTracker, num);
            minIncrement += numTracker - num;
            numTracker += 1;
        }

        return minIncrement;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
}
