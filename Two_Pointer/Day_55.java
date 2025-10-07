
import java.util.Arrays;

public class Day_55 {

    public static int countTriangles(int arr[]) {
        int ans = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n - 1; i >= 2; i--) {
            int j = 0, k = i - 1;
            while (j < k) {
                int twoSum = arr[j] + arr[k];
                if (twoSum > arr[i]) {
                    ans += k - j;
                    k--;
                } else {
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 7};
        System.out.println(countTriangles(arr));
    }
}
