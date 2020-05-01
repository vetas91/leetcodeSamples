import tasks.CountingElements;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("Result is : ");
        System.out.println(new CountingElements().countElements(new int[]{1, 2, 3}));
        System.out.println(new CountingElements().countElements(new int[]{1,1,3,3,5,5,7,7}));
        System.out.println(new CountingElements().countElements(new int[]{1,3,2,3,5,0}));
        System.out.println(new CountingElements().countElements(new int[]{1,1,2,2}));
    }

    private static void printArray(Object... items) {
        System.out.println(Arrays.deepToString(items));
    }
}
