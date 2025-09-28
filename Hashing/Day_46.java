
import java.util.*;

public class Day_46 {

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for (int n : a) {
            set.add(n);
        }
        for (int m : b) {
            set.add(m);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i : set) {
            ans.add(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 1};
        int b[] = {3, 2, 2, 3, 3, 2};
        System.out.println(findUnion(a, b));
    }
}
