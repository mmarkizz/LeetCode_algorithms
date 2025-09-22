package Binary_Search.Easy;

import java.util.Arrays;

public class Special_Array_With_X {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int prev = -1;
        for(int i=0;i<nums.length;i++){
            if(n-i <=nums[i] && n-i>prev){
                return n-i;
            }
            prev = nums[i];
        }
        return -1;
    }
}

//РАЗОБРАТЬ ЭТУ ЗАДАЧУ
//You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
//Notice that x does not have to be an element in nums.
//Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.