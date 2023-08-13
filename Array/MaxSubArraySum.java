package Array;

//very very very Important question covering three concepts

public class MaxSubArraySum {
    public static void maxSubArray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){
            int start = i;
            //for including this condition also (2) or (4) we have use j=i
            for(int j=i;j< arr.length;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
//                    will calculate sum
                    currSum += arr[k];
                }
                System.out.println("Current Sum is: "+currSum);
                //checking if maxSum is smaller than put currSum value in maxSum
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }

        System.out.println("Max SubArray Sum by Brute force is: "+maxSum);
    }

    public static void maxSubArraySumPrefixMethod(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        //calculate prefix array
        prefix[0] = arr[0];
        for(int i=1;i< prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i=0;i< arr.length;i++){
            int start = i;
            //for including this condition also (2) or (4) we have use j=i
            for(int j=i;j< arr.length;j++){
                int end = j;
                //ternary operator is used for condition when start =0 so to avoid error here we use ternary operator
                currSum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
                //checking if maxSum is smaller than put currSum value in maxSum
                System.out.println("Current Sum is: "+currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max SubArray Sum by prefix Method is: "+maxSum);
    }

    public static  void maxSubArraySumKadane(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs = cs+ arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max SubArray Sum by Kadane Algo is: "+ms);
    }


    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
//        maxSubArray(arr);
//        maxSubArraySumPrefixMethod(arr);
        maxSubArraySumKadane(arr);
    }
}
