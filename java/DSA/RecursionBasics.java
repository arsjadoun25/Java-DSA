package DSA;

import java.util.*;

class RecursionBasics{
    public static void decreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decreasing(n-1);
    }
    public static void increasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int x = factorial(n-1);
        int fn = n * x;
        return fn;
    }
    public static void main(String[] args) {
        // decreasing(10);
        // increasing(10);
        factorial(5);
        System.out.println(factorial(5));
    }
}