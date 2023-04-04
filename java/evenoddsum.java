import java.util.*;
public class evenoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of integers to be entered: ");
        int n = sc.nextInt();
        System.out.println("enter numbers-");
        int even_sum=0 , odd_sum=0;
        for(int i=1; i<=n; i++){
            int a = sc.nextInt();
            if(a%2 == 0){
                even_sum += a;
            }
            else{
                odd_sum += a;
            }
        }
        System.out.println("Sum of even number: " + even_sum);
        System.out.println("Sum of odd number: " + odd_sum);
    }    
}
