
import java.util.HashMap;
import java.util.Map;

public class Day_62 {

    public static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // map.put(0,1);
        int res = 0;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];

            if (curr == k) {
                res = i + 1;
            } else if (map.containsKey(curr - k)) {
                res = Math.max(res, i - map.get(curr - k));
            }
            if (!map.containsKey(curr)) {
                map.put(curr, i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}
