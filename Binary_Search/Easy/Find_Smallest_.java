package Binary_Search.Easy;
public class Find_Smallest_ {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
        
            for(int i = 0;i<letters.length;i++){
                if (letters[i] > target) {
                return letters[i];
            }
            }
    
            return letters[0];
        }
    }
}