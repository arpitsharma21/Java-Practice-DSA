package Array;

public class SubArray {
    public static void printSubArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            int start = i;
            //for including this condition also (2) or (4) we have use j=i
            for(int j=i;j< arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArray(arr);

    }
}
