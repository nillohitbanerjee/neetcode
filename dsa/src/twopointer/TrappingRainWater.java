package twopointer;

public class TrappingRainWater {

    public static void main(String[] args){
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    public static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        right[height.length-1]= height[height.length-1];
        left[0]=height[0];
        for(int i= height.length-2;i>=0;i--){
            if(height[i]>right[i+1]){
                right[i]=height[i];
            }
            else
                right[i]=right[i+1];
        }

        for(int i= 1;i<height.length;i++){
            if(height[i]>left[i-1]){
                left[i]=height[i];
            }
            else
                left[i]=left[i-1];
        }

        for(int i=0; i<height.length ; i++){
            int temp =  Math.min(left[i],right[i])-height[i];
            if(temp>0){
                height[i]=temp;
            }
            else
                height[i]=0;
        }
        int op = 0 ;
        for(int i=0; i<height.length ; i++){
            op = op+height[i];
        }
        return op;
    }
}
