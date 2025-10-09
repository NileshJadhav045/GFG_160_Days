
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day_57 {

    static ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        if (k > n) {
            return res;
        }
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        res.add(map.size());
        for (int i = k; i < n; i++) {
            int removeEle = arr[i - k];
            int count = map.get(removeEle);
            if (count == 1) {
                map.remove(removeEle);
            } else {
                map.put(removeEle, count - 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            res.add(map.size());
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinct(arr, k));
    }
}
