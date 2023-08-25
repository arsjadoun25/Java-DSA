package DSA;

import java.util.*;

class TryCatch{
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        try{
            System.out.println(numbers[9]);
        }   
        catch(Exception e){
            System.out.println("Something went wrong");
        } 
    }
}