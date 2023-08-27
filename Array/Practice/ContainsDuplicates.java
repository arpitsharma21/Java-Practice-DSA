package Array.Practice;
import java.util.Arrays;

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
element is distinct.*/

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        //brute force approach
        // for(int i= 0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]== nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //Second approach
        Arrays.sort(nums);
        for(int i=0;i<n -1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
