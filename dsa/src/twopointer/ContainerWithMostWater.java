package twopointer;

public class ContainerWithMostWater {

    public static void main(String[] args){
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int start =0 ;
        int endPoint = height.length-1;
        int maxArea =0;
        while(start<endPoint){
            int length = endPoint-start;
            if(height[start]<=height[endPoint]){

                int area = length*height[start];
                if(area>maxArea)
                    maxArea =area;
                start++;
            }
            else{
                int area = length*height[endPoint];
                if(area>maxArea)
                    maxArea =area;
                endPoint--;
            }
        }
        return maxArea;
    }
}
