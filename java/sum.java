import java.util.*;
public class sum {
    public static int Sum(int a){
        int sum = 0;
        while(a>0){
            int rem = a%10;
            sum += rem;
            a = a/10;
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Sum(a));
    }
}