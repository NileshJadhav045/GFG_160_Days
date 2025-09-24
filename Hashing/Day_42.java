import java.util.*;
public class Day_42 {

    static boolean twoSum(int arr[], int target) {
        Set<Integer> set = new HashSet<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            int sum = target - arr[i];

            if (set.contains(sum)) {
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println(twoSum(arr, target));
    }
}
