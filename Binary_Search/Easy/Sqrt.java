package Binary_Search.Easy;

public class Sqrt {
    public int mySqrt(int x) {
        
        int left = 0;
        int right = x;
        while(left<right){
            int mid = (left + right + 1)>>>1;

            if (mid<= x/mid){
                left = mid;
            }else{
                right = mid -1;
            }
        }
        return left;
    }
}

//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

//You must not use any built-in exponent function or operator.