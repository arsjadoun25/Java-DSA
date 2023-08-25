package DSA;

import java.util.*;

class Complex{
    int real, imag;
    public Complex(int a, int b){
        real = a;
        imag = b;
    }
    public static Complex addition(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }
    public static Complex difference(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex((a.real*b.real), (a.imag*b.imag));
    }
    public void printComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag==0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+" + "+imag+"i");
        }
    }
}

class Solution{
    public static void main(String args[]){
        Complex a = new Complex(5, 4);
        Complex b = new Complex(4, 5);
        Complex c = Complex.addition(a, b);
        Complex d = Complex.difference(a, b);
        Complex e = Complex.product(a, b);
        c.printComplex();
        d.printComplex();
        e.printComplex();
    } 
}