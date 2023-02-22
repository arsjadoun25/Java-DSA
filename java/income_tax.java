import java.util.*;
public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tax;
        if(income < 500000){
            System.out.println("No tax will be charged");
        }
        else if(income >= 500000 && income < 1000000){
            tax = income * 0.2;
            System.out.println(tax + " tax will be charged");
        }
        else{
            tax = income * 0.3;
            System.out.println(tax + " tax will be charged");
        }
    }    
}
