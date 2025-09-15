package Binary_Search.Easy;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
    
        // Линейный поиск
        for (int i = 0; i < nums.length; i++) {
            // Если target найден, возвращаем его индекс
            if (nums[i] == target) {
                return i;
            }
    
            // Если target меньше текущего элемента, возвращаем текущий индекс
            if (target < nums[i]) {
                return i;
            }
        }
    
        // Этот return никогда не выполнится, так как мы обработали все случаи выше
        return 0;
    }
}
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.