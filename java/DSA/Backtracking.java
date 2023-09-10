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
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // BTonarray(arr, 0);
        String str = "abc";
        // findsub(str, "", 0);
        permutation(str, "");
        // printarr(arr);
    }
}