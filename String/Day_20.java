
public class Day_20 {

    public static boolean areRotations(String s1, String s2) {
        // code here
        String text = s1 + s1;
        String str = s2;

        int n = text.length();
        int m = str.length();

        int arr[] = computeArr(str);
        int i = 0, j = 0;

        while (i < n) {
            if (text.charAt(i) == str.charAt(j)) {
                i++;
                j++;

                if (j == m) {
                    return true;
                }
            } else {

                if (j != 0) {
                    j = arr[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    static int[] computeArr(String str) {
        int n = str.length();

        int[] arr = new int[n];

        int len = 0;
        arr[0] = 0;
        int i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                arr[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = arr[len - 1];
                } else {
                    arr[i] = 0;
                    i++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String s1 = "abcd", s2 = "cdab";
        System.out.println(areRotations(s1, s2));
    }
}
