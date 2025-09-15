package Binary_Search.Easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        
        int actual_sum = 0;

        int n = nums.length;

        for (int i = 0;i<nums.length;i++){
            actual_sum += nums[i];
        }

        int expected_sum = n*(n+1)/2;

        int x = expected_sum- actual_sum;
        return x ;
    }
}
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array
//YANDEX