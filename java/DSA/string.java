package DSA;

import java.util.*;

public class string {
    public static boolean pallindrome(String var){
        for(int i=0; i<var.length(); i++){
            if(var.charAt(i) != var.charAt(var.length()-1-i)){
                System.out.println("variable is not pallindrome");
                return false;
            }
        }
        System.out.println("variable is pallindrome");
        return true;
    }
    public static float get_shortest(String var){
        int x = 0, y = 0, a = 0;
        while(a<var.length()){
            if('N'==var.charAt(a)){
                y++;
            }
            else if('S'==var.charAt(a)){
                y--;
            }
            else if('E'==var.charAt(a)){
                x++;
            }
            else{
                x--;
            }
            a++;
        }
        float shortest = (float)(Math.sqrt((x*x)+(y*y)));
        return shortest; 
    }
    public static String substring(String var, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += var.charAt(i);
        }
        return substr;
    }
    public static String large(String var[]){
        String largest = var[0];
        for(int i=1; i<var.length; i++){
            if(largest.compareTo(var[i])<0){
                largest = var[i];
            }
        }
        return largest;
    }
    public static StringBuilder first_capital(String var){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(var.charAt(0));
        sb.append(ch);
        for(int i=1; i<var.length(); i++){
            if(var.charAt(i)==' ' && i<var.length()-1){
                sb.append(var.charAt(i));
                i++;
                ch = Character.toUpperCase(var.charAt(i));
                sb.append(ch);
            }
            else{
                sb.append(var.charAt(i));
            }
        }
        return sb;
    }
    public static String compress(String var){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<var.length(); i++){
            sb.append(var.charAt(i));
            int count = 1;
            while(i<var.length()-1 && var.charAt(i)==var.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
        }
        return sb.toString();
    }
    public static void check_case(String var){
        int uppercase = 0, lowercase = 0;
        for(int i=0; i<var.length(); i++){
            if(Character.isUpperCase(var.charAt(i))){
                uppercase++;
            }
            else if(Character.isLowerCase(var.charAt(i))){
                lowercase++;
            }
        }
        System.out.println("No. of uppercase: "+uppercase);
        System.out.println("No. of lowercase: "+lowercase);
    }
    public static boolean anagram(String var,String var2){
        var = var.toLowerCase();
        var2 = var2.toLowerCase();    
        if(var.length()==var2.length()){
            char[] varArray = var.toCharArray();
            char[] var2Array = var2.toCharArray();
            Arrays.sort(varArray);
            Arrays.sort(var2Array);
            boolean check = Arrays.equals(var2Array, varArray);
            if(check){
                System.out.println(var+" & "+var2+" are anagram");
                return true;
            }
            else{
                System.out.println(var+" & "+var2+" are not anagram");
                return false;
            }
        }
        else{
            return false;
        }    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String var = "abcdefgh";
        String var2 = "baegvfdh";
        //anagram(var, var2);
        //check_case(var);
        System.out.println(compress(var));
        //System.out.println(first_capital(var));
        //System.out.println("Largest string: "+large(var));
        //System.out.println(var.substring(0,5));
        //System.out.println("Subtring: "+substring(var, 0, 5));
        //System.out.println("Shortest distance to travel: "+get_shortest(var));
        //pallindrome(var);
    }
}
