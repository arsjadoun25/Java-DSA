import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        for(; number>0; ){
            int rem = number%10;
            System.out.print(rem);
            number = number/10;
        }    
    }    
}
