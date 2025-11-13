public class Nqueens {
    static int count = 0 ;
    public static void queens(int[][] board,int row){
        int n = board[0].length;
        if(row == n){
            count++;
            System.out.println("\n new one "+ count);
            for(int i = 0 ; i< n ; i++){
                System.out.println("");
                for(int j = 0 ; j< n; j ++){
                    System.out.print(board[i][j]+" ");
                }
            }
        }
        for(int col = 0; col < n ; col++){
            if(isSafe(board,row,col)){
                    board[row][col] = 1;
                    queens(board,row+1);
                    board[row][col] = 0;
            }
        }
    
    }
    public static boolean isSafe(int board[][],int row,int col){
        int n = board[0].length;
        for(int i = 0 ; i < n ; i++)
                if(board[i][col] == 1) return false;
        for(int i=row-1,j = col-1 ; i>=0 && j >=0  ;i--,j--){
                if(board[i][j] == 1) return false;
        }
        for(int i=row-1,j = col+1 ; i>=0 && j < n ;i--,j++){
                if(board[i][j] == 1) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int n = 5;
        int board[][] = new int[n][n];
        queens(board,0);
    }
}