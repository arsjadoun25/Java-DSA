package DSA;
public class tryout {
    public static void main(String[] args) {
        String str = "tony";
        String str2 = "tony";
        String str3 = new String("tony");
        String str4 = str3.intern();
        String str5 = str2.intern();
        String str6 = new String("tony").intern();
        System.out.println(str5==str6);
        System.out.println(str==str3);
        System.out.println(str==str4);
        System.out.println(str==str5);
        System.out.println(str2==str3);
        System.out.println(str2==str4);
        System.out.println(str2==str5);
        System.out.println(str3==str4);
        System.out.println(str3==str5);
        System.out.println(str4==str5);
        System.out.println(str6==str3);
    }
}