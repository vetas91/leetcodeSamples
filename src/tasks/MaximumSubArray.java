package tasks;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        final int length = nums.length;
        int currentMax = nums[0];
        for (int j = 0; j < length; j++) {
            int lineSum = 0;
            for (int i = j; i < length; i++) {
                lineSum += nums[i];
                currentMax = Math.max(lineSum, currentMax);
            }
        }

        return currentMax;
    }
}
