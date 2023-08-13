package Array.Assignment;

/*There is an integer array nums sorted in ascending order (with distinct values).
        Prior to being passed to your function, nums is possibly rotated at an unknown
        pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
        nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
        example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
        become [4,5,6,7,0,1,2].
        Given the array nums after the possible rotation and an integer target, return the
        index of target if it is in nums, or -1 if it is not in nums.
        You must write an algorithm with O(log n) runtime complexity.*/

public class searchNumber {
    public static int check(int num[],int target){ //Approach: Binary search
        int n = num.length;
        int low = 0;
        int high = n - 1 ;
        while(low <= high){
            int mid = (low + high)/2;
            if(num[mid] == target){
                return mid;
            }
            //  finding if low to mid is sorted
            else if (num[low] <= num[mid] ) {
                //check if target is in b/w low to mid part
                if(target >= num[low] && target < num[mid]){
                    high = mid -1;
                }
                else {
                    low = mid +1;
                }
            }
            //check  if mid to high is sorted
            else if(num[mid] <= num[high]){
                //check if target is in b/w mid to high part
                if(target > num[mid] && target < num[high]){
                    low = mid +1 ;
                }
                else{
                    high = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int num [ ] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(check(num,target));
    }
}
