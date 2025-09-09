
import java.util.Arrays;

public class Day_27 {

    public static void mergeArrays(int a[], int b[]) {
        // code here
        int i = a.length - 1;
        int j = 0;
        while (i >= 0 && j < b.length) {
            if (a[i] < b[j]) {
                i--;
            } else {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 7, 10};
        int b[] = {2, 3};
        mergeArrays(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
