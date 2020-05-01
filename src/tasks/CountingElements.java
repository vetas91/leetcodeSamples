package tasks;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * <p>
 * If there're duplicates in arr, count them seperately.
 * <p>
 * Input: arr = [1,1,2,2]
 * Output: 2
 * Explanation: Two 1s are counted cause 2 is in arr.
 */
public class CountingElements {


    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>(arr.length);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + 1)) {
                count++;
            }
        }
        return count;
    }


}
