import java.util.Scanner;
class addM
{
int x,y;
void input()
{
    Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
    y=sc.nextInt();
}
int sum()
{
return (x+y);
}
}
public class add {
    public static void main(String [] args){
        addM ob=new addM();
        ob.input();
        int z=ob.sum();
        System.out.println(z);
    }
}