import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Table of- ");
        int a = sc.nextInt();
        for(int i=1; i<=10; i++){
            int multi = a*i;
            System.out.println(a+" * "+i+" = "+multi);
        }
    }    
}
