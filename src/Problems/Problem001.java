package Problems;

public class Problem001 {
    /**
     * Finds the Sum of all multiples of 3 and 5 smaller than 1000.
     */
    public static int solve(){
        final int MAX = 999;
        //n times the Euler sum from 1 to 1000/n is the sum of all multiples of n smaller than 1000
        int sum3 = 3* gauss(MAX/3);
        int sum5 = 5* gauss(MAX/5);
        int sum15 = 15* gauss(MAX/15);

        //calculate sum of 3 and 5 divisible numbers minus double counted ones
        return sum3 + sum5 - sum15;
    }

    private static int gauss(int n){
        return n*(n+1)/2;
    }

}
