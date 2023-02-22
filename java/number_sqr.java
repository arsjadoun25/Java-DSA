import java.util.*;
public class number_sqr {
    public static void num_sqr(int n){
        for(int i=1; i<=n; i++){
            int a = 1;
            for(int j=i; j<=i+6; j++){
                if(j<=7){
                    System.out.print(j);
                }
                else{
                    System.out.print(a);
                    a++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num_sqr(7);
    }    
}
