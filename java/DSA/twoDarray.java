package DSA;

import java.util.Scanner;

public class twoDarray {
    public static void large_small(int matrix[][], int n, int m){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("minimum number: "+min);
        System.out.println("maximum number: "+max);
    }
    public static boolean search(int matrix[][], int n, int m, int target){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(target==matrix[i][j]){
                    System.out.println("Target is present in row: "+i+"    column: "+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void spiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int j=endcol-1; j>=startcol; j--){
                if(endcol==startcol){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i=endrow-1; i>startrow; i--){
                if(endrow==startrow){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
    public static void diagonal_sum(int matrix[][]){
        int sum = 0;
    /*  for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }*/
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static boolean staircase_search(int matrix[][], int target){
      /*int i = 0;
        int j = matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(target==matrix[i][j]){
                System.out.println("key found at ("+i+","+j+")");
                return true;
            }
            else if(target>matrix[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("key not found!");
        return false;*/
        int i = matrix.length-1;                                                         //Alternative
        int j = 0;
        while(i>=0 && j<matrix.length){
            if(target==matrix[i][j]){
                System.out.println("key found at ("+i+","+j+")");
                return true;
            }
            else if(target>matrix[i][j]){
                j++;
            }
            else{
                i--;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void count_num(int matrix[][], int target){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(target==matrix[i][j]){
                    System.out.println("key found at ("+i+","+j+")");
                    count++;
                }    
            }
        }
        if(count!=0){
            System.out.println("count of target :"+count);
        }
        else{
            System.out.println("key not found!");
        }
    }
    public static void row_sum(int matrix[][]){
        int sum = 0;
        for(int j=0; j<matrix[0].length; j++){
            sum += matrix[1][j];
        }
        System.out.println("sum of desired row :"+sum);
    }
    public static void transpose(int matrix[][]){
        int trans[][] = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                trans[j][i] = matrix[i][j];
            }
        }
        for(int i=0; i<trans.length; i++){
            for(int j=0; j<trans[0].length; j++){
                System.out.print(trans[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void print_arr(int matrix[][], int  n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      /*int matrix[][] = new int[4][4];
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }*/
        int matrix[][] = {{1, 4, 9},{11, 4, 3}};
        transpose(matrix);
        //row_sum(matrix);
        //int target = sc.nextInt();
        //count_num(matrix, target);
        //staircase_search(matrix, target);
        //print_arr(matrix,n,m);
        //diagonal_sum(matrix);
        //spiral(matrix);
        //large_small(matrix, n, m);
        //System.out.println(search(matrix, n, m, target));       
    }
}
