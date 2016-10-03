package HackerRank;

import java.util.*;
import java.io.*;

class Java_Datatypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++) {

            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if (x >= (-1*Math.pow(2,7)) && x <= (Math.pow(2,7)-1)) {System.out.println("* byte");}
                if (x >= (-1*Math.pow(2,15)) && x <= (Math.pow(2,15)-1)) {System.out.println("* short");}
                if (x >= (-1*Math.pow(2,31)) && x <= (Math.pow(2,31)-1)) {System.out.println("* int");}
                if (x >= (-1*Math.pow(2,63)) && x <= (Math.pow(2,63)-1)) {System.out.println("* long");}
                //Complete the code
            }

            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
