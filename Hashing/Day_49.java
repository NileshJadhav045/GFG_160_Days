
import java.util.HashMap;
import java.util.Map;

public class Day_49 {

    public static int cntSubarrays(int[] arr, int k) {

        int sum = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(cntSubarrays(arr, k));

    }
}
