package HackerRank;

import java.util.*;
import java.io.*;

class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = 1; // int t=in.nextInt();
        for(int i=0;i<t;i++){

        int a = 0;  // int a = in.nextInt();
        int b = 2;  // int b = in.nextInt();
        int n = 10; // int n = in.nextInt();

            for (int j=1; j <= n; j++) {
                a = (int) (a + Math.pow(2,j-1) * b);
                System.out.print(a + " ");
            }
            System.out.println("");
        }

        in.close();
    }
}
