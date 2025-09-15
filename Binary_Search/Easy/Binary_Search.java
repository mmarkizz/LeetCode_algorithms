package Binary_Search.Easy;

public class Binary_Search {
    public int search(int[] nums, int target) {
        
        int low = 0;
        int hight = nums.length -1;
        
        while(low<=hight){

            int mid = (low + hight)/2;
            int guess = nums[mid];

            if(guess== target){
                return mid;
            }

            if(guess>target){
                hight= mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return -1;
    }
}
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
// If target exists, then return its index. Otherwise, return -1.