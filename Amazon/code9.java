package Amazon;

public class code9 {
    static int isValid(int mat[][]){
        // code here
        int [][] row = new int[9][9];
        int [][] col = new int[9][9];
        int [][] box = new int[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(mat[i][j]!=0){
                row[i][mat[i][j]-1]++;
                col[j][mat[i][j]-1]++;
                box[(i/3)*3 + j/3][mat[i][j]-1]++;
                if(row[i][mat[i][j]-1]>1 || col[j][mat[i][j]-1]>1 || box[(i/3)*3 + j/3][mat[i][j]-1]>1)
                return 0;
                }
                
            }
        }
        return 1;
    }
}
