package Array.Assignment;

public class trapWater {
    public static void trap(int height[]){
        int n = height.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        rightmax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftmax[i],rightmax[i]);
            trappedWater += waterLevel - height[i];
        }

        System.out.println("Maximum water trapped is: "+trappedWater);
    }

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        trap(height);
    }
}
