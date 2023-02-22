package DSA;

import java.util.*;

public class bitwise {
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n&bitmask)==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is not even");
        }
    }
    public static void getIth_bit(int n, int i){
        int bitmask = 1<<i;
        if((n&bitmask)!=0){
            System.out.println(i+" bit is: "+1);
        }
        else{
            System.out.println(i+" bit is: "+0);
        }
    }
    public static void setIth_bit(int n, int i){
        int bitmask = 1<<i;
        System.out.println(n|bitmask);
    }
    public static int clearIth_bit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void update(int n, int i, int newBit){
        //if(newBit==0){
        //    clearIth_bit(n, i);
        //}
        //else{
        //    setIth_bit(n, i);  
        //}
        n = clearIth_bit(n, i);
        int bitmask = newBit<<i;
        System.out.println(n|bitmask);
    }
    public static void clearlastI_bits(int n, int i){
        int bitmask = (~0)<<i;
        System.out.println(n&bitmask);  
    }
    public static void clearRange_bits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bitmask = a|b;
        System.out.println(n&bitmask);
    }
    public static boolean ispowerof2(int n){
        int bitmask = n&(n-1);
        return (bitmask==0);  
    }
    public static int setof1(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;    
    }
    public static int fast_expo(int n,int a){
        int res = 1;
        while(a>0){
            if((a&1)!=0){
                res = res*n;
                n = n*n;
            }
            else{
                //res = res*1;
                n = n*n;
            }
            a = a>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fast_expo(n, 5));
        //System.out.println(setof1(n));
        //System.out.println(ispowerof2(n)); 
        //clearRange_bits(n, 2, 7);
        //clearIth_bit(n, 2);
        //update(n, 2, 1);
        //clearIth_bit(n, 1);
        //setIth_bit(n, 2);
        //getIth_bit(n,3);
        //oddoreven(n);
    }
}
