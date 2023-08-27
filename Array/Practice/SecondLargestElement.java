package Array.Practice;

import java.util.Arrays;

/*Given an array Arr of size N, print second largest distinct element from an array.*/

public class SecondLargestElement {
    public static int search(int[] arr){
        int n = arr.length;

//        Arrays.sort(nums);
//        int largest = nums[n-1];
//        for(int i =0;i<n;i++){
//            if(nums[i] == largest){
//                return nums[i-1];
//            }
//        }
//        return -1;

        int largest = arr[0];
        int second = -1;
        for(int i=1;i<n;i++){
            //first check the element is greater than the largest if yes than put the value in largest variable
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
            //for having distinct element and number is less than highest and
            else if(arr[i] < largest && arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int num[] = {7, 3, 2, 4, 9, 12,56, 56};
        System.out.println(search(num));
    }
}
