
import java.util.*;


public class Anagram {

    public static boolean areAnagrams(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (var n : map.entrySet()) {
            if (n.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "geeks", s2 = "kseeg";
        System.out.println(areAnagrams(s1, s2));
    }
}
