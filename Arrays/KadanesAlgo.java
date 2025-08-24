
public class KadanesAlgo {
/*Q). Kadane's Algorithm
 * You are given an integer array arr[]. You need to find the maximum sum of a 
 * subarray (containing at least one element) in the array arr[].

    Note : A subarray is a continuous part of an array.
 */
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int ans = arr[0];
        int maxIdx = arr[0];

        for (int i = 1; i < n; i++) {
            maxIdx = Math.max(maxIdx + arr[i], arr[i]);

            ans = Math.max(ans, maxIdx);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
