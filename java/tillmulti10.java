import java.util.*;
public class tillmulti10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*while(true){
            int number = sc.nextInt();
            if(number%10 == 0){
                break;
            }
            System.out.println(number);
        }*/
        do{
            int number = sc.nextInt();
            if(number%10 == 0){
                break;
            }
            System.out.println(number);
        }while(true);
        System.out.println("You are out");    
    }    
}
