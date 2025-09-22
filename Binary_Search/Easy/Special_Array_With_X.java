package Binary_Search.Easy;

import java.util.Arrays;

public class Special_Array_With_X {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<=n;i++){
            int left = 0;
            int right = nums.length;

            while(left<right){
                int mid = left+(right - left) /2;

                if(nums[mid] < i){
                    left=mid +1;
                }else{
                    right = mid;
                }
            }
            if (n-left == i){
                return i;
            }
        }
        return -1;
    }
}

//РАЗОБРАТЬ ЭТУ ЗАДАЧУ
//You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
//Notice that x does not have to be an element in nums.
//Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.