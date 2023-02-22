package DSA;

import java.util.*;

class Pen{
    int tip;
    String color;
    void setTip(int newTip){
        tip = newTip;
    }
    void setColor(String newColor){
        color = newColor;
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
        p.setColor("red");
        System.out.println(p.color);
    }    
}
