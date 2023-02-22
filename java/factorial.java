import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int facto = 1;
        while(a>0){
            facto *= a;
            a--;
        }
        System.out.println("Factorial of the number is: " + facto);
    }    
}
