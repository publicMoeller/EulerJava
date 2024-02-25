package Problems;

public class Problem002 {
    /**
     * Returns the sum of all even fibonacci numbers not exceeding 4,000,000.
     */
    public static int solve(){
        int MAX = 4000000;
        int lower = 1;
        int higher = 2;
        int sum = 0;
        while(higher <= MAX){
            if(higher%2 == 0){sum += higher;}
            higher = higher + lower;
            lower = higher - lower;


        }
        return sum;
    }
}
