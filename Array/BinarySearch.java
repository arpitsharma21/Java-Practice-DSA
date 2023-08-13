package Array;

public class BinarySearch {
    public static int search(int numbers[],int key){
        int start = 0;int end = numbers.length -1 ;

        while(start <= end){
            int mid = (start + end) / 2;
            //key found
            if(numbers[mid] == key){
                return mid;
            }
            //key is less so left part
            if(numbers[mid] > key){
                end = mid -1;
            }
            //key is greater so right part
            else{
                start = mid + 1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1,4,8,9,23,56,78};
        int key  = 56;
        int index = search(numbers,key);
        System.out.println("Index is: "+index);
    }
}
