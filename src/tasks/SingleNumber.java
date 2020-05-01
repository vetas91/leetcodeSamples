package tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        // TODO improve
        return singleNumber;
    }


    /**
     * Spend 23 min
     * @param nums
     * @return
     */
    public int solution1(int[] nums) {
        int singleNumber = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int amount = map.getOrDefault(currentNumber, 0);
            map.put(currentNumber, amount + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                singleNumber = e.getKey();
                break;
            }
        }
        return singleNumber;
    }
}
