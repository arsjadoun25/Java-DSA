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
    public static int sumofN(int n){
        if(n==0){
            return 0; 
        }
        int sum = n + sumofN(n-1);
        return sum;
    }
    public static int fibnum(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int x = fibnum(n-1) + fibnum(n-2);
        return x;
    }
    public static boolean checksort(int arr[], int n){
        if(n == arr.length-1){
            return true;
        }
        if(arr[n]>arr[n+1]){
            return false;
        }
        return checksort(arr, n+1);
    }
    public static int Istoccur(int arr[], int i, int n){
        if(n == arr.length-1){
            return -1;
        }
        if(arr[n]==i){
            return n;
        }
        return Istoccur(arr, i, n+1);
    }
    public static int lastoccur(int arr[], int i, int n){
        if(n == 0){
            return -1;
        }
        if(arr[n]==i){
            return n;
        }
        return Istoccur(arr, i, n-1);
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        x *= power(x, n-1);
        return x;
    }
    // 0(logn) Complexity
    public static int power1(int x, int n){
        if(n==0){
            return 1;
        }
        int y = power1(x, n/2);
        y *= y;
        if(n%2 != 0){
            y = x * y;
        }
        return y;
    }
    /*Question- Given a "2*n" board and tiles of size "2*1", count the number of ways to tile the
                given board using the 2*1 tile. (A tile can either be placd horizontally or vertically) 
     */
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical arrangement
        int x = tiling(n-1);
        //horizontal arrangement
        int y = tiling(n-2);
        return x + y;
    }
    public static void rmduplicate(String str, int idx, StringBuilder x, boolean map[]){
        if(idx == str.length()){
            System.out.println(x);
            return;
        }
        char ch = str.charAt(idx);
        if(map[ch-'a']==true){
            rmduplicate(str, idx+1, x, map);
        } else{
            map[ch-'a'] = true;
            rmduplicate(str, idx+1, x.append(ch), map);
        }
    }
    /*FRIENDS PAIRING PROBLEM-
      Given n friends, each one can remain single or can be paired up with some other friend.
      Each friend at once can be paired only with one person. Find out the total number of ways in which
      friend can remain singleor can be paired.
     */
    public static int pairing(int n){
        if(n==1 || n==2){
            return n;
        }
        // int x = pairing(n-1);
        // int y = pairing(n-2);
        // int tw = (n-1)*y;
        // tw = tw + x;
        // return tw;
        return pairing(n-1) + (n-1)*pairing(n-2);
    }
    public static void BinaryString(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastplace==0){
            BinaryString(n-1, 0, str+"0");
            BinaryString(n-1, 1, str+"1");
        } else{
            BinaryString(n-1, 0, str+"0");
        }
        // BinaryString(n-1, 0, str+"0");
        // if(lastplace==0){
        //     BinaryString(n-1, 1, str+"1");
        // }
    }
    
    
    /*Practice Ques 1
      For a given integer array of size N. You have to find all the occurrences(indices) of a given
      element(Key) and print them. Use a recursive function to solve this problem.
    */
    public static void printindex(int arr[], int key, int n){
        if(n==arr.length){
            return;
        }
        if(arr[n]==key){
            System.out.print(n+" ");
        }
        printindex(arr, key, n+1);
    }


    /*Practice Ques 2
      You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.
      Use a recursive function to solve this problem. NOTE-The digits of the number will only be in the 
      range 0-9 and the last digit of a number can’t be 0. 
      Sample Input: 1947 
      Sample Output: “one nine four seven”
    */
    public static void Numbername(String digits[], int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        Numbername(digits, n/10);
        System.out.print(digits[rem]+" ");
    }


    /*Practice Ques 3
      Write a program to findLength of aStringusing Recursion.
    */
    public static int LengthStr(String str){
        if(str.length()==0){
            return 0;
        }
        return LengthStr(str.substring(1)) +1;
    }


    /*Pratice Ques 4
      We are given a string S, we need to find the count of all contiguous substrings starting and ending
      with the same character. 
      Sample Input 1: S = "abcab"
      Sample Output 1: 7
      There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
      Out of the above substrings, there are 7 substrings: a, abca, b, bcab, c, a and b.
      So, only 7 contiguous substrings start and end with the same character.
    */
    public static int ques4(String str, int i, int j, int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res = ques4(str, i+1, j, n-1) + ques4(str, i, j-1, n-1) - ques4(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }


    /*Practice Ques 5
      Tower of Hanoi
    */
    public static void TowerOfHanoi(int disk, String S, String H, String D){
        if(disk==1){
            System.out.println( "Transfer "+disk+" from "+S+" to "+D);    
            return;
        }
        TowerOfHanoi(disk-1, S, D, H);
        System.out.println( "Transfer "+disk+" from "+S+" to "+D);
        TowerOfHanoi(disk-1, H, S, D);        
    }  
    public static void main(String[] args) {
        // decreasing(10);
        // increasing(10);
        // System.out.println(factorial(5));
        // System.out.println(sumofN(5));
        // System.out.println(fibnum(6));
        // int arr[] = {1, 2, 3, 2, 5};
        // System.out.println(checksort(arr, 0));
        // System.out.println(Istoccur(arr, 2, 0));
        // System.out.println(lastoccur(arr, 2, arr.length-1));
        // System.out.println(power(5, 4));
        // System.out.println(power1(5, 4));
        // System.out.println(tiling(3));
        // String str = "nikhil";
        // rmduplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(pairing(3));
        // BinaryString(3, 0, "");
        // int[] arr = {3,2,4,5,6,2,7,2,2};
        // printindex(arr, 2, 0);
        // String digits[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // Numbername(digits, 1947);
        // System.out.print ln(LengthStr("abcde"));
        // String str = "abcab";
        // System.out.println(ques4(str, 0, str.length()-1, str.length()));
        TowerOfHanoi(4, "S", "H", "D");
    }
}    
