import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int operation = sc.next().charAt(0);
        switch(operation){
            case '+' : System.out.println(x+y);
                        break;
            case '-' : System.out.println(x-y);
                        break;
            case '*' : System.out.println(x*y);
                        break;
            case '/' : System.out.println(x/y);
                        break;
            case '%' : System.out.println(x%y);
        }
    }    
}
