package Tools;
public class Polygonals {
    /** Implements methods for calculating polygonal numbers and checking numbers for being specific polygonals*/

    public static int getPolygonal(int s, int n){
        /* returns the n-th s-gonal number */
        if (s < 2) {throw new IllegalArgumentException("Not a polygonal number");}
        if (n < 1) {throw new IllegalArgumentException(" only positive n-th polynomials are defined");}
        return (((s-2)*n*n-(s-4)*n))/2;
    }

    public static boolean checkPolygonal(int s, int candidate){
        /* checks if candidate is s-gonal. Returns true for n-th s-gonal or false for not s-gonal */
        if (s < 2) {throw new IllegalArgumentException("We do not test for point numbers ;)");}
        if (candidate < 1) {throw new IllegalArgumentException("only positive polygonals are defined");}
        if(s == 2){return true;} //line segment case
        double test = Math.sqrt(8*(s-2)* candidate + Math.pow((s-4),2))+(s-4);
        int divisor = 2 * (s-2);

        return test % divisor == 0;
    }




}