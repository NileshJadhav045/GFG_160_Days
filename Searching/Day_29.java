
public class Day_29 {

    public static int findMin(int arr[]) {
        int lo = 0, hi = arr.length-1;
        while (lo < hi) {
            if (arr[lo] < arr[hi]) {
                return arr[lo];
            }

            int mid = lo + hi / 2;

            if (arr[mid] > arr[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return arr[lo];
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(findMin(arr));
    }
}
