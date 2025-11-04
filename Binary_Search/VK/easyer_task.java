package LeetCode_algorithms.Binary_Search.VK;

public class easyer_task {
    
    public int BinarySearchCopyTime(int n, int x, int y){
        int left = 0;
        int right = (n-1) * Math.max(x, y);

        while(left+1 < right){
            int middle = (right + left)/2;

            if(middle/x + middle/y < n-1){
                left = middle;
            } else{
                right = middle;
            }
        }
        return right + Math.min(x, y);
    }
}
//жюри решило добавить в вариант олимпиады ещё одну задачу
//Задачу напечатали в одном экземпляре и теперь ему нужно 
//до начала олимпиады успеть сделать ещё n копий

//в его распоряжении имеются два ксерокса один из которых копирует лист за x
// а другой за y. Разрешается использовать как один ксерокс так и два одновременно
//можно копировать не только с оригинала но и с копии

//помоги ему выяснить какое минимальное время для этого потребуется