package DSA;

import java.util.*;

// *getter and setter*
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

// *Inheritance- Single level, Multilevel, Heirarchy, Hybrid*
class Animal{
    String color;
    void setColor(String newColor){
        color = newColor;
    }
}
class dog extends Animal{
    int leg;
}
class fish extends Animal{
    int fins;
}
class bird extends Animal{
    int feather;
}
class puppy extends dog{
    String breed;
}

// *Polymorphism*

// method overloading
class add{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

//method overriding
class addition extends add{
    int sum(int a, int b){
        return a+b+1;
    }
}

// *main*
public class OOPS {
    public static void main(String[] args) {
        // Pen p = new Pen();
        // p.setColor("Black");
        // System.out.println(p.getColor());
        // p.setTip(5);
        // System.out.println(p.get_tip());
        // Animal a = new Animal();
        // a.color = "black";
        // System.out.println(a.color);
        // dog d = new dog();
        // fish f = new fish();
        // bird b = new bird();
        // d.leg = 4;
        // d.color = "black";
        // f.fins = 2;
        // f.color = "white";
        // b.feather = 3;
        // d.color = "orange";
        // puppy p = new puppy();
        // p.leg = 5;
        // p.breed = "husky";
        // p.color = "Grey";
        // System.out.println(p.breed);
        // System.out.println(p.leg);
        // System.out.println(p.color);
        add ad = new add();
        System.out.println(ad.sum(1, 2));
        System.out.println(ad.sum(1, 2, 3));
        System.out.println(ad.sum((float)1.1,(float)2.1));
    }    
}
