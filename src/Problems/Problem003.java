package Problems;

public class Problem003 {
    /**
     * Returns the largest prime factor of 600851475143.
     */
    public static long solve(){
        long hugeNumber = 600851475143L;
        for(long i = 2L;true; i++){
            while(hugeNumber % i == 0)
            {
                if(hugeNumber == i) {return i;}
                hugeNumber =hugeNumber/i;
            }

        }
    }
}
