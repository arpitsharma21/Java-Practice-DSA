package OOPS;

public class Solution {
    public static void main(String[] args) {
        Complex c = new Complex(5,4);
        Complex d = new Complex(4,9);

        Complex e = Complex.add(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.product(c,d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}

class Complex{
    int real;
    int imag;

    Complex(int i,int j){
        this.real = i;
        this.imag = j;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new
                Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}