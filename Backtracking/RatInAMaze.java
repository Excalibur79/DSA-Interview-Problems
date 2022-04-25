package Backtracking;

public class RatInAMaze {
    public static int m,n;
    public static void compute(int[][] maze,int[][] soln,int i,int j ){
        if(i==m-1 && j==n-1){
            for(int row[]:soln){
                for(int cell:row)
                    System.out.print(cell+" ");
                System.out.println();
            }
            System.out.println();
        }
        //bottom check
        if(i+1<=m-1 && maze[i+1][j]==1){
            soln[i+1][j] = 1;
            compute(maze,soln,i+1,j);
            soln[i+1][j]=0;
        }
        if(j+1<=n-1 && maze[i][j+1]==1){
            soln[i][j+1]=1;
            compute(maze,soln,i,j+1);
            soln[i][j+1] = 0;
        }
    }
    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}};
        int soln[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        soln[0][0] = 1;
        m = maze.length;
        n = maze[0].length;
        compute(maze,soln,0,0);
    }
    
}