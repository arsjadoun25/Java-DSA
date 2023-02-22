import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isprime = true;
        for(int i = 2; i<=Math.sqrt(number); i++){
            if(number%i == 0){
                isprime = false;
            }
        }
        if(isprime == true){
            System.out.println(number + " is prime");
        }
        else{
            System.out.println(number + " is not prime");
        }
    }    
}
