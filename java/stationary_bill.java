import java.util.*;
public class stationary_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float stationary_bill = (pen+pencil+eraser)*1.18f;
        System.out.println(stationary_bill);
    }
}
