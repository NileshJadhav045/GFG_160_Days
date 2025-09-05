
public class Day_23 {

    static int inversionCount(int arr[]) {
        // Code Here
        return countInv(arr, 0, arr.length - 1);
    }

    static int countInv(int arr[], int l, int r) {
        int res = 0;
        if (l < r) {

            int mid = (l + r) / 2;

            res += countInv(arr, l, mid);

            res += countInv(arr, mid + 1, r);

            res += countAndMarge(arr, l, mid, r);
        }

        return res;
    }

    static int countAndMarge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }

        int res = 0;
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res += (n1 - i);
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }
}
