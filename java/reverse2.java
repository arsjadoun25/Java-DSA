import java.util.*;
public class reverse2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int rev = 0;
        for(; number>0; ){
            int rem = number%10;
            number = number/10;
            rev = (rev*10) + rem;
        }
        System.out.println("reverse : " + rev);    
    }    
}