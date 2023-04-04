import java.util.*;
public class iseven {
    public static boolean iseven(int a){
        if(a%2 != 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(iseven(a));
    }    
}
