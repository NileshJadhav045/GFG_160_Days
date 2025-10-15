
import java.util.HashMap;
import java.util.Map;

public class Day_63 {

    public static int maxLen(int[] arr) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0) ? -1 : 1;

            if (sum == 0) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 0, 0};
        System.out.println(maxLen(arr));
    }
}
