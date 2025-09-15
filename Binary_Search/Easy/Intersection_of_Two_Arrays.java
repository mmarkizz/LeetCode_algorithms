package Binary_Search.Easy;

import java.util.*;

public class Intersection_of_Two_Arrays {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
    
        for (int num : nums1) {
            set1.add(num);
        }
    
        for (int num : nums2) {
          set2.add(num);
        }
    
        set1.retainAll(set2);
    
    // Преобразуем результат в массив
        int[] result = new int[set1.size()];
        int index = 0;

        for (int num : set1) {
           result[index++] = num;
        }

        return result;
    }
}
}
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.