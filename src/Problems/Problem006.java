package Problems;

public class Problem006 {
    /** Finds the difference between the sum of the squares of the first one
     * hundred natural numbers and the square of the sum.
     *
     * all this will fail for big integers, because pow relies on floats (uses standardized hardware ops to be
     * faster than it would be with actual int I assume).
     */
    static public int solve(){
        return sumSquareDifference(100);
    }

    static int sumSquareDifference(int i){
        return gaussSquare(i) - sumOfSquares(i);
    }

    static int gaussSquare(int n){
        return (int) Math.pow(n*(n+1)/2,2);
    }


    static int sumOfSquares(int n){
        return (int) ((2*Math.pow(n,3)+3*Math.pow(n,2)+n)/6);
    }
}