public class Q2_StrobogrammaticNumber {
    public static boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if (!isStrobogrammaticChar(leftChar, rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isStrobogrammaticChar(char c1, char c2) {
        return (c1 == '0' && c2 == '0') ||
                (c1 == '1' && c2 == '1') ||
                (c1 == '6' && c2 == '9') ||
                (c1 == '8' && c2 == '8') ||
                (c1 == '9' && c2 == '6');
    }

    public static void main(String[] args) {
        String num = "69";
        boolean isStrobogrammatic = isStrobogrammatic(num);
        System.out.println(isStrobogrammatic);
    }
}
