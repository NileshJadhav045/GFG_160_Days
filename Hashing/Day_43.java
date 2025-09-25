
import java.util.HashMap;
import java.util.Map;

public class Day_43 {

    static int countPairs(int arr[], int target) {
        // code here
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                count += map.get(target - arr[i]);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println(countPairs(arr, target));
    }
}
