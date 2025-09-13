
public class Day_31 {

    public static int peakElement(int[] arr) {
        // code here
        int n = arr.length;

        if (n == 1) {
            return 0;
        }

        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        if (arr[0] > arr[1]) {
            return 0;
        }

        int lo = 1;
        int hi = n - 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 8, 3};
        System.out.println(peakElement(arr));
    }
}
