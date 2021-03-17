package codewars;

import java.util.Scanner;

public class Intejir12 {
    public static void main(String[] args) {
        int adad,vohid,dahi,sadi,summa,zarb;
        Scanner scanner=new Scanner(System.in);
        System.out.println("a=");
        adad=scanner.nextInt();
        sadi=adad/100;
        dahi=adad%10;
        vohid=(adad/10)%10;
        System.out.println("sadi="+sadi);
        System.out.println("dahi="+dahi );
        System.out.println("vohid="+vohid);
        zarb=sadi*dahi*vohid;
        System.out.println("zarb="+zarb);
        summa=sadi+dahi+vohid;
        System.out.println("summa="+summa);

    }
}
