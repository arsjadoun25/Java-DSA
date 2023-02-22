public class rotatedhppattern{
    public static void main(String[] args) {
        int n = 6;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(j<n){
                    System.out.print(j);
                }
            }
            System.out.println();
            n--;
        }
    }
}