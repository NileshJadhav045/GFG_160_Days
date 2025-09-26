
import java.util.*;

public class Day_44 {

    public static List<List<Integer>> findTriplets(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> t = new ArrayList<>();
                        t.add(i);
                        t.add(j);
                        t.add(k);
                        ans.add(t);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr));
    }
}
