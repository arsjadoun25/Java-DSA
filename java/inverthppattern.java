public class inverthppattern {
    public static void main(String[] args) {
        int n = 3;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                if(j>n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            n--;
            System.out.println();
        }
    }
}
