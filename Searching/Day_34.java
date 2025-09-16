
import java.util.Arrays;

public class Day_34 {

    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int start = Arrays.stream(arr).max().getAsInt();
        int end = sum;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValid(arr, n, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    static boolean isValid(int arr[], int n, int k, int maxAllowedPages) {
        int stud = 1, pages = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxAllowedPages) {
                return false;
            }
            if (pages + arr[i] <= maxAllowedPages) {
                pages += arr[i];
            } else {
                stud++;
                pages = arr[i];
            }
        }

        return stud <= k;
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int k = 2;
        System.out.println(findPages(arr, k));
    }
}
