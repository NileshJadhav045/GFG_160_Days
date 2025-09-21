
public class Day_39 {

    public static boolean searchRowMatrix(int[][] mat, int x) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            if (isFound(mat[i], x)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isFound(int arr[], int k) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == k) {
                return true;
            } else if (k < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {{3, 4, 9}, {2, 5, 6}, {9, 25, 27}};
        int x = 9;
        System.out.println(searchRowMatrix(mat, x));
    }
}
