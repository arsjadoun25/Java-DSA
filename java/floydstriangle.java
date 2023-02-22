public class floydstriangle {
    public static void main(String[] args) {
        int a = 1;
//      int n = 1;
 /*     for(int i=1; i<=5; i++){
            for(int j=1; j<=n; j++){
                if(j%2!=0){
                    System.out.print(a);
                    a++;
                }
                else{
                    System.out.print(" ");
                }    
            }
            n+=2;
            System.out.println();
        }*/
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
