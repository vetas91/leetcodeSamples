package strngs;


/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * <p>
 * Note that after backspacing an empty text, the text will continue empty.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * <p>
 * Example 4
 * <p>
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        if (S.equals(T)) return true;
        return getClearString(S).equals(getClearString(T));
    }


    private String getClearString(String input) {
        char[] array = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char ch : array) {
            if (ch == '#') {
                if (builder.length() > 0){
                    builder.deleteCharAt(builder.length() - 1);
                }
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    /**
     * Not working with aa## -> a
     *
     * @param input
     * @return
     */
    private String getClearStringWrong(String input) {
        String s = input.replaceAll(".?#", "");
        System.out.println(input + "->" + s);
        return s;
    }
}
