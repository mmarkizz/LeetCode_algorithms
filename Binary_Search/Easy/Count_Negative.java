package Binary_Search.Easy;

public class Count_Negative {
    public int countNegatives(int[][] grid) {
        int x = 0;
        for (int i=0; i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    x++;
                }
            }
        }
        return x;
    }

    public int coutNegatives(int[][] grid) { //O(m+n)
        int m=grid.length-1;
        int n=grid[0].length-1;
        int j=0;
        int c=0;
        while(m>=0 && j<=n)
        {
            if(grid[m][j]<0)
            {
                c+=n-j+1;
                m--;
            }
            else
            {
                j++;
            }
        }
        return c;
    }
}
//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.