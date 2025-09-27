
import java.util.*;


public class Day_45 {

    public static ArrayList<Integer> intersect(int[] a, int[] b) {

        Set<Integer> set = new HashSet<>();

        for (int n : a) {
            set.add(n);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int m : b) {
            if (set.contains(m)) {
                ans.add(m);
                set.remove(m);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 1};
        int b[] = {3, 1, 3, 4, 1};
        System.out.println(intersect(a, b));
    }
}
