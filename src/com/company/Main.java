package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x, y=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        x = in.nextInt();

        System.out.println("a=3x^(1/3)-7= " +((3 * (Math.pow(x,1.0/3)))-7));
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.print("Input y: ");
        y = in.nextInt();
        System.out.println("b=4х*3-12y=" +(4*x*3-12*y));
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.print("Input y: ");
        y = in.nextInt();
        System.out.println("c=sin(х*(-3+2y)+1)="+(Math.sin(x*(-3+2*y)+1)));
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.println("d=122х^(-2)="+(122 * Math.pow(x, -2)));
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.print("Input y: ");
        y = in.nextInt();
        System.out.println("e=х^4*|485-179y|="+(Math.pow(x,4)*Math.abs(485-179*y)));
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.println("f =3+9^х-5/х-1="+(3 + Math.pow(9,x) - (5/x) - 1));
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.println("g=(2,5*(4-6х)-5="+((2.5*(4-6*x)-5)));
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.println("h=cos(x/2)+sin(x/4)+3x/6="+(Math.cos(x/2)+Math.sin(x/4)+3*x/6));
        System.out.print("Input x: ");
        x = in.nextInt();
        System.out.println("y=|5x-3/x2+6+7x3-12|="+(Math.abs(5*x - 3/Math.pow(x,2) + 6 + 7*Math.pow(x,3) - 12)));


    }
}
