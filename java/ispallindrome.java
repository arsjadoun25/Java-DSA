import java.util.*;
public class ispallindrome {
    public static void ispallin(int a){
        int copy = a;
        int rev = 0;
        while(a>0){
            int rem = a%10;
            rev = rev*10 + rem;
            a = a/10;
        }
        if(rev==copy){
            System.out.println("number is pallindrome");
        }
        else{
            System.out.println("number is not pallindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ispallin(a);
    }    
}
