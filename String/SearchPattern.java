
import java.util.ArrayList;

public class SearchPattern {

    public static void construct(String patt, int arr[]) {
        int len = 0;
        arr[0] = 0;

        int i = 1;
        while (i < patt.length()) {
            if (patt.charAt(i) == patt.charAt(len)) {
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
    }

    static ArrayList<Integer> search(String pat, String txt) {
        // code here
        int n = pat.length();
        int m = txt.length();

        int arr[] = new int[m];
        ArrayList<Integer> ans = new ArrayList<>();

        construct(pat, arr);
        int i = 0;
        int j = 0;

        while (i < m) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;

                if (j == n) {
                    ans.add(i - j);
                    j = arr[j - 1];
                }
            } else {
                if (j != 0) {
                    j = arr[j - 1];
                } else {
                    i++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String txt = "abcab", pat = "ab";
        System.out.println(search(pat, txt));
    }
}
