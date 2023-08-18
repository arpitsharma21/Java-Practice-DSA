package Strings;

public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            //get the direction
            char dir = path.charAt(i);
            //For south
            if(dir == 'S'){
                y--;
            } else if (dir == 'N') {
                y++;
            }
            //for east
            else if (dir== 'E') {
                x++;
            }
            else{
                x--;
            }
        }
        //X2 = (x2-x1)^2
        int X2 = x*x;
        int Y2 = y*y;
        //sqrt returns double value so typcast it
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
