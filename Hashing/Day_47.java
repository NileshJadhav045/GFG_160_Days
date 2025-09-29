
import java.util.Arrays;

public class Day_47 {

    public static int longestConsecutive(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);
        int curr = 1, ans = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                curr++;
            } else if (arr[i] != arr[i - 1]) {
                ans = Math.max(curr, ans);
                curr = 1;
            }
        }
        return Math.max(ans, curr);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 9, 10, 20, 10};
        System.out.println(longestConsecutive(arr));
    }
}
