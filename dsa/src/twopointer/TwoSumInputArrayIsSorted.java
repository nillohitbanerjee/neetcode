package twopointer;

public class TwoSumInputArrayIsSorted {

    public static void main(String[] args){
        int[] op = twoSum(new int[]{2, 7, 11, 15},9);
        System.out.println(op[0]+" , "+op[1]);

        op = twoSum(new int[]{2, 3,4},6);
        System.out.println(op[0]+" , "+op[1]);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int end = numbers.length-1;
        int start = 0;
        int[] op = new int[2];
        while(start<=end){
            int temp = numbers[start]+numbers[end];
            if(temp>target){
                end--;
            }
            else if(temp<target){
                start++;
            }
            else {
                op[0]=start+1;
                op[1] =end+1;
                break;
            }
        }
        return op;

    }
}
