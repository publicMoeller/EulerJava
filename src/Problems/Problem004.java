package Problems;

public class Problem004 {
    /**
     * Returns the largest palindromic product of two three-digit numbers.
     */


    public static int solve() {
        int a = 999;
        int b = 999;
        int max = 0;
        int test = 0;
        while(a > 99){
            while (a <= b) {
                test = a * b;
                if (test > max && isPalindrome(test)) {
                    max = test;
                }
                b--;
            }
            a--;
            b = 999;
        }
    // if we reach this, something is wrong.
    return max;
    }

    static boolean isPalindrome(int input) {
        String candidate = Integer.toString(input);
        int length = candidate.length();
        for (int i = 0; i < length / 2; i++) {
            if (candidate.charAt(i) != candidate.charAt(length - i - 1)) {
                return false;
            }


        }
        return true;
    }
}
