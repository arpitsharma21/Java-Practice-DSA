package Array;

public class TrappingRainWater {
    public static int trappedWater(int height[]){
        int n = height.length;
                                            //Calculate left max boundary
        int leftmax[] = new int[n];
        //first element will be taken from height array as it is the left most so no value can be bigger than it
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            //Comparing the particular height with the previous elements height and the max will be taken
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

                                             //Calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            //i+1 isliye ki hmne ulta shuru kiys hai so to access next elem we have to use i+1
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trappedWater = 0;

                                           //loop and find water level
        for(int i=0;i<n;i++){
            //Calculate water level by taking min of left or right max boundary
            int waterLevel = Math.min(leftmax[i],rightmax[i]);
            //Calculate trapped water =(WaterLevel - height) * width
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
