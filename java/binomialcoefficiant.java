/*binomial coefficiant= n!/(r!(n-r)!) */
import java.util.*;
public class binomialcoefficiant {
    public static int facto1(int n){
        int facto1 = 1;
        while(n>0){
            facto1 *= n;
            n--;
        }
        return(facto1);
    }
    public static int facto2(int r){
        int facto2 = 1;
        while(r>0){
            facto2 *= r;
            r--;
        }
        return(facto2);
    }
    public static int facto3(int diff){
        int facto3 = 1;
        while(diff>0){
            facto3 *= diff;
            diff--;
        }
        return(facto3);
    }
    public static int factorial(int n, int r, int diff){
        int factorial = facto1(n)/(facto2(r)*facto3(diff));
        return(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int diff = n-r;
        int factorial = factorial(n, r, diff);
        System.out.println(factorial);
    }    
}
