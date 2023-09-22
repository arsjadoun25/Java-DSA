package DSA;

import java.util.*;

class Backtracking{

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void BTonarray(int arr[], int i){
        if(i>arr.length-1){
            printarr(arr);
            return;
        }
        arr[i] = i+1;
        BTonarray(arr, i+1);
        arr[i] = arr[i]-2;
    }

    public static void findsub(String str, String subs, int i){
        if(i>str.length()-1){
            if(subs.length()==0){
                System.out.println("null");
            }else{
                System.out.println(subs);
            }
            return;
        }
        findsub(str, subs+str.charAt(i), i+1);
        findsub(str, subs, i+1);
    }

    public static void permutation(String str, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            permutation(Newstr, perm+curr);
        }

    }

    public static void NQueens(char chess[][], int row){
        if(row == chess.length){
            count++;
            printchess(chess);                  //to print total no. of ways

            //TO PRINT ONLY ONE WAY-----------
            // if(count==1){
            //     printchess(chess);
            // }
            return;
        }
        for(int j=0; j<chess.length; j++){
            if(issafe(chess, row, j)){
                chess[row][j] = 'Q';
                NQueens(chess, row+1);
                chess[row][j] = '.';
            }
        }
    }

    public static boolean issafe(char chess[][], int row, int col){
        //vertically
        for(int i= row-1; i>=0; i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printchess(char chess[][]){
        System.out.println(" --------chess board--------- ");
        for(int i=0; i<chess.length; i++){
            for(int j=0; j<chess.length; j++){
                System.out.print (chess[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int GridWays(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        } else if(i==n || j==m){
            return 0;
        }
        int w1 = GridWays(i+1, j, n, m);
        int w2 = GridWays(i, j+1, n, m);
        return w1+w2;
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int x = factorial(n-1);
        int fn = n * x;
        return fn;
    }

    public static int GridWays1(int n, int m){                 //optimized
        int ways = factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1));
        return ways;
    }

    public static boolean Sudoku(int board[][], int row, int col){
        if(row==9){
            return true;
        }

        int nextrow=row, nextcol=col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }

        if(board[row][col] != 0){
            return Sudoku(board, nextrow, nextcol);
        }

        for(int num=1; num<=9; num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = num;
                if(Sudoku(board, nextrow, nextcol)){
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void printboard(int board[][]){
        System.out.println("-------------");
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print (board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int board[][], int row, int col, int num){
        //vertically
        for(int i=0; i<9; i++){
            if(board[i][col]==num){
                return false;
            }
        }
        //horizontal
        for(int j=0; j<9; j++){
            if(board[row][j]==num){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean mazerunner(int maze[][]){
        int N = maze.length;
        int sol[][] = new int[N][N];
        if(mazerunnerUntil(maze, 0, 0, sol)==false){
            System.out.println("Solution does nt exist");
            return false;
        }
        printsol(sol);
        return true;
    }

    public static boolean mazerunnerUntil(int maze[][], int x, int y, int sol[][]){
        if(x == maze.length-1 && y == maze.length-1 && maze[x][y]==1){
            sol[x][y] = 1;
            return true;
        }
        //check if maze[x][y] is valid
        if(iSSafe(maze, x, y)){
            if(sol[x][y]==1){
                return false;
            }
            sol[x][y] = 1;
            if(mazerunnerUntil(maze, x+1, y, sol)){
                return true;
            }
            if(mazerunnerUntil(maze, x, y+1, sol)){
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static boolean iSSafe(int maze[][], int x, int y){
        // if x y outisde maze return false
        return(x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
    }

    public static void printsol(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print (sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void combination(String D){
        int len = D.length();
        if(len==0){
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), D);
    }

    public static void bfs(int pos, int len, StringBuilder sb, String D){
        if(pos==len){
            System.out.println(sb.toString());
        }else{
            char[] letters = L[Character.getNumericValue(D.charAt(pos))];
            for(int i = 0; i<letters.length; i++){
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), D);
            }
        }
    }

    public static boolean Knight(){
        int sol[][] = new int [8][8];
        for (int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                sol[x][y] = -1;
            }
        }
        int xmove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int ymove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        //As the knight starts from cell 0 0
        sol[0][0] = 0;

        if(!solveKnightuntil(0, 0, 1, sol, xmove, ymove)){
            System.out.println("Sol. doesn't exists");
            return false;
        }else{
            printsol(sol);
        }
        return true;
    }

    public static boolean solveKnightuntil(int x, int y, int movei, int sol[][], int xmove[], int ymove[]){
        int k, next_y, next_x;
        if(movei == N*N){
            return true;
        }
        for(k=0; k<8; k++){
            next_x = x + xmove[k];
            next_y = y + ymove[k];
            if(ISsafe(next_x, next_y, sol)){
                sol[next_x][next_y] = movei;
                if(solveKnightuntil(next_x, next_y, movei+1, sol, xmove, ymove)){
                    return true;
                }else{
                    sol[next_x][next_y] = -1;
                }
            }
        }
        return false;
    }

    public static boolean ISsafe(int x, int y, int sol[][]){
        return (x>=0 && x<N && y>=0 && y<N && sol[x][y] == -1);
    }






    static  int N = 8;
    final static char[][] L= {{},{},{'a','b','c'},
                                  {'d','e','f'},{'g','h','i'},{'j','k','l'},
                                  {'m','n','o'},{'p','q','r','s'},{'t','u','v'},
                                  {'w','x','y','z'}};
    static int count = 0;

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // BTonarray(arr, 0);
        //String str = "abc";
        // findsub(str, "", 0);
        //permutation(str, "");
        // printarr(arr);
	// int n = 4;
        // char chess[][] = new char[n][n];
        // for(int i=0; i<chess.length; i++){
        //     for(int j=0; j<chess.length; j++){
        //         chess[i][j] = '.';
        //     }
        // }
        // NQueens(chess, 0);                                                                                         //to find and print ways
        // System.out.println("Total no. of ways to put N queens in N rows so that they dont kill each other: "+count);   //to print the no. of ways   
        // if(count>0){                                                                                                   //to find if the sollution is possible or not
        //     System.out.println("Solution is possible");                                             
        // }
        // int n = 3, m = 3;
        // System.out.println(GridWays(0, 0, n, m));
        // System.out.println(GridWays1(n, m));
        // int board[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
        // {4, 9, 0, 1, 5, 7, 0, 0, 2},
        // {0, 0, 3, 0, 0, 4, 1, 9, 0},
        // {1, 8, 5, 0, 6, 0, 0, 2, 0},
        // {0, 0, 0, 0, 2, 0, 0, 6, 0},
        // {9, 6, 0, 4, 0, 5, 3, 0, 0},
        // {0, 3, 0, 0, 7, 2, 0, 0, 4},
        // {0, 4, 9, 0, 3, 0, 0, 5, 7},
        // {8, 2, 7, 0, 0, 9, 0, 1, 3}};
        // int board[][] = {{0, 0, 1},{3, 0, 0},{0, 0, 0}};
        // if(Sudoku(board, 0, 0)){
        //     System.out.println("Solution exists");
        //     printboard(board);
        // }else{
        //     System.out.println("Solution does not exist");
        // }
        // int maze[][] = {{1, 1, 1, 1},
        //                 {0, 1, 0, 1},
        //                 {1, 1, 1, 1},
        //                 {1, 0, 1, 1}};
        // mazerunner(maze);
        // combination("23");
        Knight();
    }
}
