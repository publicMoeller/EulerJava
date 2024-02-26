package Problems;

import Tools.Polygonals;

import static java.lang.Math.abs;


public class Problem044 {
    /* Find the pair of pentagonal numbers, P_j and P_k, for which their sum and difference are pentagonal
     * and D = |P_k - P_j| is minimised; what is the value of D$*/

    public static int solve(){
        int D = Integer.MAX_VALUE;
        for (int k = 2;true;k++){
            for(int j = 1;j<k;j++){
                if (isCandidate(j,k)){
                    D = Integer.min(D,getD(j,k));
                    return D;
                }

            }
        }
    }
    private static boolean isCandidate(int a, int b){
        /* Checks if sum and difference of j-th and k-th pentagonals are pentagonal*/
        a = Polygonals.getPolygonal(5,a);
        b = Polygonals.getPolygonal(5,b);
        boolean sum = Polygonals.checkPolygonal(5, abs(b-a));
        boolean difference = Polygonals.checkPolygonal(5,a+b);
        return  sum && difference ;
    }

    private static int getD(int a, int b){
        /*technically doing redundant work, but we seldom use it and it is more readable*/
        a = Polygonals.getPolygonal(5,a);
        b = Polygonals.getPolygonal(5,b);
        return abs(b-a);

    }

}
