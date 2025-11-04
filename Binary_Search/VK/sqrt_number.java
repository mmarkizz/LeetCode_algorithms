package LeetCode_algorithms.Binary_Search.VK;

public class sqrt_number {
    
    public int SqrtBinarySearch(int target){
        int left = 0;
        int right = target;
        while(left<=right){
            int middle = (left+right)/2;

            if(middle*middle>target){
                right=middle-1;
                continue;
            }

            if(middle*middle<target){
                left = middle + 1;
                continue;
            }
            return middle;
        }
        return right;
    }
}
//написать функцию которая будет возвращать корень числа или 
//ближайшее наименьшее кнему значение