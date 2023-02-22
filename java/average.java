import java.util.*;
public class average {
    public static float Average(int a,int b,int c){
        int avrg = (a+b+c)/3;
        return avrg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Average(a,b,c));
    }
}
