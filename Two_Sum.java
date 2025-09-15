import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            
            int diff = target - nums[i];
            if (hash.containsKey(diff)){
                return new int[] { hash.get(diff), i };
            }
            else{
                hash.put(nums[i],  i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] t = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(t));
    }
}