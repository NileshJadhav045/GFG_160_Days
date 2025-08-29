
public class Atoi {

    public static int myAtoi(String s) {
        // code here
        int sign = 1, ans = 0, idx = 0;
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }

        if (idx < s.length() && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
            if (s.charAt(idx++) == '-') {
                sign = -1;
            }
        }

        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {

            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = 10 * ans + (s.charAt(idx++) - '0');
        }
        return ans * sign;
    }

    public static void main(String[] args) {
        String s = "-123";
        System.out.println(myAtoi(s));
    }
}
