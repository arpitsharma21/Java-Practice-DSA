package Recursion.Assignment;

public class TowerOfHanoi {
    public static void towerHanoi(int n,String src,String helper,String dest){
        //base case
        if(n==1){
            System.out.println("Transfer disk " +n+" from "+src +" to "+dest);
            return;
        }
        //firstly we have to transfer n-1 disks from source to helper using destination as helper
        towerHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk " +n+" from "+src +" to "+dest);
        //transfer disks from helper to dest using source as a helper
        towerHanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        int n=2;
        towerHanoi(n,"S","H","D");
    }
}
