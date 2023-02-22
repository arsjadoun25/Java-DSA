import java.util.*;
public class decitobin {
    public static void binary(int a){
        int binNum = 0;
/*      while(a>0){
            int rem = a%2;
            binNum = binNum*10 + rem; 
            a = a/2;
        }
        System.out.print("binary = ");
        while(binNum>0){
            int rev = binNum%10;
            System.out.print(rev);
            binNum = binNum/10;
        }*/    
        int pow = 0;
        while(a>0){
            int rem = a%2;
            binNum = binNum + rem*(int)Math.pow(10,pow); 
            a = a/2;
            pow++;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynum = sc.nextInt();
        binary(mynum);        
    }
}
