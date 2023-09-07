package Recursion;

/*  Given a 2XN board and tiles 2X1 , count the no, of ways to tile the given board using 2X1 tiles.
    (A tile can be placed horizontally or vertically)
*/

public class TilingProblem {
    public static int tiling(int n){
        // here n is the length as 2 is given breath in the question

                                // Base case
        if(n==0 || n==1){
            return 1;
        }
                                 //kaam
        //vertical choice
        int fnm1 = tiling(n-1);
        //horizontal choice
        int fnm2 = tiling((n-2));
        //total no.of ways
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tiling(3));
    }
}
