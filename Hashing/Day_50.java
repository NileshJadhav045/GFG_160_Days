
import java.util.HashMap;
import java.util.Map;

public class Day_50 {

    public static long subarrayXor(int arr[], int k) {
        
        int prefXor = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            prefXor ^= n;

            res += map.getOrDefault(prefXor ^ k, 0);

            if (prefXor == k) {
                res++;
            }

            map.put(prefXor, map.getOrDefault(prefXor, 0) + 1);

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarrayXor(arr, k));
    }
}
