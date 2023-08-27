package Array.Practice;

/*Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a
variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:
    -Each student gets one packet.
    -The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum
    chocolates given to the students is minimum.

   T = O(nlogn)
    */

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int choco[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        int diff = chocolate(choco,m);
        System.out.println("Minimum difference is: "+diff);
    }

    public static int chocolate(int nums[],int m){
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        //loop for getting pairs of 3 as m=3
        for(int i=0;i< n-m;i++){
            //minimum value
            int min_value = nums[i];
            //for getting to m i.e 3 we have to do i+m-1 as i starts from 0
            int max_value = nums[i+m-1];
            //finding the diff b/w max and min value
            int gap = max_value - min_value;
            //if min value is less than the ans variable then put ans = gap
            if(ans > gap){
                ans = gap;
            }
        }
        return ans;
    }
}
