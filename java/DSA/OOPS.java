package DSA;

import java.util.*;

class Pen{
    int tip;
    String color;
    void setTip(int tip){
        this.tip = tip;
    }
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
    int get_tip(){
        return this.tip;
    }
}
class Animal{
    int height;
    String color;
    void setHeight(int newHeight){
        height = newHeight;
    }
    void setColor(String newColor){
        color = newColor;
    }
}
public class OOPS {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Black");
        System.out.println(p.getColor());
        p.setTip(5);
        System.out.println(p.get_tip());
        Animal a = new Animal();
        a.color = "black";
        System.out.println(a.color);
    }    
}
