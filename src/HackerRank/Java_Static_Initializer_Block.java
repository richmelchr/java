package HackerRank;

import sun.misc.JavaLangAccess;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

    static Scanner scan = new Scanner(System.in);
    static boolean flag = true;
    static int B = scan.nextInt();
    static int H = scan.nextInt();

    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }








    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }


    }


}
