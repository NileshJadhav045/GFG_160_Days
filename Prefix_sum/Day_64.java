
public class Day_64 {

    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];

        int beforeCurrent = 1;
        int afterCurrent = 1;

        for (int i = 0; i < n; i++) {
            res[i] = beforeCurrent;
            beforeCurrent *= arr[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            res[i] *= afterCurrent;
            afterCurrent *= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 7, 9};
        int ans[] = productExceptSelf(arr);
        for (int a : ans) {
            System.out.print(a+" ");
        }
    }
}
