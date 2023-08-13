package Array;

public class LargestNumber {
    public static void main(String[] args) {
        int numbers[] = {12,2,6,3,5};
        //It simplifies - infinty
        int largest = Integer.MIN_VALUE;
        for(int i=0;i< numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largets number is: "+ largest);
    }
}
