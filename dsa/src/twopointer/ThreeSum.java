package twopointer;

import java.util.*;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> output = new HashSet<>();
        int target =0;
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i++){
            int start =0;
            int end = nums.length-1;
            int temp = target-nums[i];

            while(start<end){

                if(start ==i )
                    start++;
                if(end ==i)
                    end--;

                if(nums[start]+nums[end]>temp){
                    end--;
                }
                else if(nums[start]+nums[end]<temp){
                    start++;
                }
                else{
                    List<Integer> tempList = new ArrayList<>();
                    if(i!=start && i!=end && start!=end){
                        tempList.add(nums[i]);
                        tempList.add(nums[start]);
                        tempList.add(nums[end]);
                        Collections.sort(tempList);
                        output.add(tempList);
                        end--;
                        start++;
                    }
                }
            }
        }
        //Creation of ArrayList
        return new ArrayList<>(output);
    }
}
