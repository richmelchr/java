import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for(int i=0; i<3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.print(s1);

            int length = s1.length();
            int spaces = 15 - length;

            for (int j=0; j < spaces; j++) {
                System.out.print(" ");
            }

            String x = Integer.toString(x);
            x = ("000" + x).substring(x.length());

            System.out.print(x);
            System.out.println("");
        }

        System.out.println("================================");

    }
}