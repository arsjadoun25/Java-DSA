import java.util.*;
public class bintodeci {
    public static float decimal(int a){
        int num = 0;
        int pow = 0;
        while(a>0){
            int rem = a%10;
            a = a/10;
            num += rem*Math.pow(2, pow);
            pow++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(decimal(a));
    }
}