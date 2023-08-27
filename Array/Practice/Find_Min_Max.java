package Array.Practice;

public class Find_Min_Max {
    public static void main(String[] args) {
        int A[] = {-1,2,-3,5,6};
        int n = A.length;
        Solution sol = new Solution();
        Solution.findSum(A,n);
    }
}

class Solution{
    public static int findSum(int A[],int N)
    {
        //Approach 1: Using Sorting
        // Arrays.sort(A);
        // int s = A[0] + A[N-1];
        // return s;

        // Approach 2: Brute force
        int ma = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;

        for(int i=0;i<N;i++){
            if(A[i] < mi){
                mi = Math.min(A[i],mi);
            }
            if(A[i] > ma){
                ma = Math.max(A[i],ma);
            }
        }

        return (mi + ma);

    }
}
