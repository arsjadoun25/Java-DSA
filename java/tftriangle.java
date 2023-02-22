//not complete
public class tftriangle {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0 && j%2==0){
                    System.out.println(a);
                }
                else{
                    System.out.println(b);
                }
            }
            System.out.println();
        }
    }
}