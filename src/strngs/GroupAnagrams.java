package strngs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            final String key = getKey(str);
            List<String> words = map.get(key);
            if (words != null) {
                words.add(str);
            } else {
                words = new ArrayList<>();
                words.add(str);
                map.put(key, words);
            }
        }

        return new ArrayList<>(map.values());
    }

    private String getKey(String str) {
        byte[] bytes = str.getBytes();
        final int length = bytes.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                byte l = bytes[j];
                byte r = bytes[j + 1];
                if (l > r) {
                    bytes[j] = r;
                    bytes[j + 1] = l;
                }
            }
        }
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < length; i++) {
            b.append(bytes[i]);
        }
        return b.toString();
    }
}
