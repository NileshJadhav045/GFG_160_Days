
public class AddBinaryStr {

    static String trimZeros(String s) {
        int firstZero = s.indexOf('1');
        return (firstZero == -1) ? "0" : s.substring(firstZero);

    }

    public static String addBinary(String s1, String s2) {

        s1 = trimZeros(s1);
        s2 = trimZeros(s2);

        int n = s1.length();
        int m = s2.length();

        if (n < m) {
            return addBinary(s2, s1);
        }

        int j = m - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {

            int bit1 = s1.charAt(i) - '0';
            int sum = bit1 + carry;

            if (j >= 0) {
                int bit2 = s2.charAt(j) - '0';
                sum += bit2;
                j--;
            }
            int bit = sum % 2;
            carry = sum / 2;

            sb.append((char) (bit + '0'));
        }
        if (carry > 0) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "1101", s2 = "111";
        System.out.println(addBinary(s1, s2));
    }
}
