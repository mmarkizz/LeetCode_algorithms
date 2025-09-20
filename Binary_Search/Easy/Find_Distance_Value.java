public class Find_Distance_Value {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;
        for(int i =0 ; i< arr1.length; i++){
            boolean isConvinient = true;
            for(int j=0; j<arr2.length; j++){
                if(Math.abs(arr1[i]-arr2[j]) <= d){
                    isConvinient = false;
                    break;
                }
            }
            if(isConvinient){
                result++;
            }
        }
        return result;
    }
}

//Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

//The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
