package codewars;

import java.awt.*;
import java.sql.Array;
import java.util.*;
import java.util.List;

class Kurs4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x <= y && y < z) {
            System.out.println(x * y);

        }
        if (y <= z && z < x) {
            System.out.println(y * z);

        }
        if (x <= z && z < y) {
            System.out.println(x * z);
        }


//        for (int i=0; i<n; i++) {
//            System.out.println("Malika");
//        }


//        int a, b, c, d;
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        if (a > b) {
//            System.out.println(a);
//            System.out.println(b);
//        } else {
//            System.out.println(b);
//            System.out.println(a);
//
//        }

//        int a,b;
//        a=scanner.nextInt();
//        if (a>0){
//            b=a+1;
//        }else if (a<0)
//
//            {
//            b=a-2;
//
//        }else {
//            b=a+10;
//        }
//        System.out.println(b);


        // 1
//        int a, P;
//        System.out.println("a = ");
//        a = scanner.nextInt();
//        P = 4 * a;
//        System.out.println("Javob P = " + P);

        //2
//        int a,s;
//        System.out.println("a=");
//        a= scanner.nextInt();
//        s=a*a;
//        System.out.println("s="+s);
        //4
//        double d,l;
//        final double p = 3.14;
//        System.out.println("d = ");
//        d = scanner.nextDouble();
//        l = p * d;
//        System.out.println("l = " + l);
        //3
//        int a,b,s,p;
//        System.out.println("a = ");
//        a = scanner.nextInt();
//        System.out.println("b= ");
//        b=scanner.nextInt();
//        s=a*b;
//            p=2*(a+b);
//        System.out.println("s = " + s);
//        System.out.println("p = " + p);
        //5

//        double a,s ,v;
//        System.out.println("a=");
//        a= scanner.nextDouble();
//        v = Math.pow(a,3);
//        s= 6*a*a;
//        System.out.println("v= "+ v);
//        System.out.println("s= " + s);
        //6
//        int a,b,c,v,s;
//        System.out.println("a=");
//        a= scanner.nextInt();
//        System.out.println("b=");
//        b= scanner.nextInt();
//        System.out.println("c=");
//        c= scanner.nextInt();
//        v=a*b*c;
//        s= 2*(a*b+b*c+a*c);
//        System.out.println("v= "+ v);
//        System.out.println("s= "+ s);

    }
}
