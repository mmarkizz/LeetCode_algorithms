package Binary_Search.Easy;

import java.util.HashSet;

public class Check_In_N {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();

    for (int num : arr) {
        // Проверяем условия
        if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
            return true;
        }
        // Добавляем элемент в set
        set.add(num);
    }
        return false;
    }
}
//Given an array arr of integers, check if there exist two indices i and j such that :

//i != j
//0 <= i, j < arr.length
//[i] == 2 * arr[j]