package Binary_Search.Easy;

public class Kth_Missing_Positive_Number {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Количество пропущенных чисел до arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left + k;
    }
}
//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//РАЗОБРАТЬ ЭТУ ЗАДАЧУ
//Return the kth positive integer that is missing from this array.
