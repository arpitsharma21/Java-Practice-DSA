package Array.Assignment;

/*Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.*/

public class checkArrayUnique {
    public static boolean checkUnique(int nums[]){
        //brute force - T= O(n^2)
        for(int i=0; i<nums.length-1 ; i++) {
            for(int j=i+1; j<nums.length ; j++ ) {
                if( nums[i] == nums[j] ) {
                    return true ;
                }
            }
        }
        return false;


    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        boolean check = checkUnique(arr);
        System.out.println(check);
    }
}
