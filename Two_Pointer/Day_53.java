
import java.util.ArrayList;
import java.util.Arrays;

public class Day_53 {

    public static ArrayList<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = arr.length - 1;
        int diff = Integer.MAX_VALUE;
        while (start < end) {
            int sum = arr[start] + arr[end];

            if (Math.abs(target - sum) < diff) {
                diff = Math.abs(target - sum);
                ans.clear();
                ans.add(arr[start]);
                ans.add(arr[end]);
            }
            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 5};
        int target = 25;
        System.out.println(sumClosest(arr, target));
    }
}
