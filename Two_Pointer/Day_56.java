
import java.util.ArrayList;

public class Day_56 {

    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int l = 0, sum = 0;
        for (int r = 0; r < n; r++) {
            sum += arr[r];
            while (sum > target && l <= r) {
                sum -= arr[l];
                l++;
            }
            if (sum == target) {
                res.add(l + 1);
                res.add(r + 1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr, target));
    }
}
