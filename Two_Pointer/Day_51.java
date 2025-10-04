
public class Day_51 {

    public static int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else if (sum == target) {
                    count++;
                    int temp = j + 1;
                    while (temp < k && arr[temp] == arr[temp - 1]) {
                        count++;
                        temp++;
                    }
                    k--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {-3, -1, -1, 0, 1, 2};
        int target = -2;
        System.out.println(countTriplets(arr, target));
    }
}
