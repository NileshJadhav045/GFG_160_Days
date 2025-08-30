
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepChar {

    public static char nonRepeatingChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRepeatingChar(s));
    }
}
