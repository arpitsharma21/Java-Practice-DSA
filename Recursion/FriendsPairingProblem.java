package Recursion;

public class FriendsPairingProblem {

    public static int friendPairing(int n){
                                //base case
        if(n<=2){
            return n;
        }

                                    //kaam
        //single
        int fnm1 = friendPairing(n-1);
        //pair
        int pairWays = (n-1) * friendPairing(n-2);
        //total no. of ways
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
}
