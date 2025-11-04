package LeetCode_algorithms.Binary_Search.VK;

public class Diploms {
    
    public int BinarySearchForDiploms(int w, int h, int n){

        int left = Math.max(w, h);
        int right = left * n;

        while(left+1<right){

            int middle = (left+right)/2;
            int res = (middle/w) * (middle/h);
            if(res<n){
                left=middle;
            } else{
                right = middle;
            }
        }
        return right;

    }
}
//Дано 9 прямоугольных дипломов(3х4) которые необходимо разместить
//на квадратной доске
//необходимо найти минимальную сторону квадрата для размещения всех дипломов
