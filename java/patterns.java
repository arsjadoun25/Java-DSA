import java.util.*;
public class patterns {
    public static void hollow_rect(int totrow, int totcol) {
        for(int i=1; i<=totrow; i++){
            for(int j=1; j<=totcol; j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zero_one(int totrow){
        for(int i=1; i<=totrow; i++){
            for(int j=1; j<=i; j++){
                if((i-j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }    
    }
    public static void butterfly(int x){
        int n = (int)(x/2);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }   
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
    public static void pallin_tri(int n){
        for(int i=1; i<=n; i++){
            int a = 1;
            for(int j=1; j<=n+i-1; j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    if(j<=n){
                        System.out.print(a);
                        a++;
                    }                   
                    else{
                        if(j==n+1){
                            a-=2;
                            System.out.print(a);
                        }
                        else{
                            a--;
                            System.out.print(a);
                        }    
                    }
                }    
            }
            System.out.println();            
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pallin_tri(a);
        //diamond(a);
        //hollow_rhombus(a);
        //rhombus(a);
        //butterfly(a);
        //zero_one(a);
        //int b = sc.nextInt();
        //hollow_rect(a, b);
    } 
}
