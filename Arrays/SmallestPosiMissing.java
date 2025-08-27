
import java.util.Arrays;

public class SmallestPosiMissing {

    public static int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == res) {
                res++;
            } else if (arr[i] > res) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }
}
