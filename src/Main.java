import strngs.BackspaceStringCompare;
import tasks.CountingElements;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("Result is : ");
        System.out.println(new BackspaceStringCompare().backspaceCompare("ab#c", "ad#c"));
        System.out.println(new BackspaceStringCompare().backspaceCompare("a##c", "#a#c"));
        System.out.println(new BackspaceStringCompare().backspaceCompare("ab##", "c#d#"));
    }

    private static void printArray(Object... items) {
        System.out.println(Arrays.deepToString(items));
    }



}
