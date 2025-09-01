
public class Day_19 {

    static int[] computeArray(String s) {
        int n = s.length();
        int arr[] = new int[n];
        arr[0] = 0;
        int len = 0;
        int i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                arr[i++] = len;
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

    public static int minChar(String s) {
        // code here
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();

        s = s + "$" + rev;

        int arr[] = computeArray(s);

        return (n - arr[arr.length - 1]);

    }

    public static void main(String[] args) {
        String s = "aacecaaaa";
        System.err.println(minChar(s));
    }
}
