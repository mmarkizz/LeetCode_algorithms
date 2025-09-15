package Binary_Search.Easy;

public class CountingWords {
    public int prefixCount(String[] words, String pref) {
        
        int x = 0;

        for(String word : words){
            if (word.startsWith(pref)){
                x++;
            }
        }

        return x;
    }
}
