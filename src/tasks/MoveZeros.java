package tasks;

import java.util.Arrays;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        final int length = nums.length;
        int[] copy = Arrays.copyOf(nums, length);
        int lastPosition = 0;
        int zeroStart = length;
        for (int i = 0; i < length; i++) {
            if (copy[i] == 0) {
                zeroStart--;
            } else {
                nums[lastPosition] = copy[i];
                lastPosition++;
            }
        }
        for (int i = zeroStart; i < length; i++) {
            nums[i] = 0;
        }
    }
}
