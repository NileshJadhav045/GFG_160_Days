import java.util.Arrays;

/* Q). Minimize the Heights II
 * Given an array arr[] denoting heights of n towers and a positive integer k.
    For each tower, you must perform exactly one of the following operations exactly once.
    Increase the height of the tower by k
    Decrease the height of the tower by k
    Find out the minimum possible difference between the height of the shortest and 
    tallest towers after you have modified each tower.
    Note: It is compulsory to increase or decrease the height by k for each tower. 
        After the operation, the resultant array should not contain any negative integers.
 */
public class MinimizeHeight {
    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int minH, maxH;
        int res = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] - k < 0)
                continue;

            minH = Math.min(arr[0] + k, arr[i] - k);

            maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            res = Math.min(res, maxH - minH);
        }

        return res;
    }

    public static void main(String[] args) {
        int heights[] = { 1, 5, 8, 10 };
        int k = 2;
        System.out.println(getMinDiff(heights, k));
    }
}
