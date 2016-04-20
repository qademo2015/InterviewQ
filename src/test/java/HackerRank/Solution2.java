package HackerRank;

import java.util.Scanner;

/**
 * Created by abarabash on 3/22/16.
 */
public class Solution2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String format = String.format("%-15s%03d", s1, x);
            System.out.printf(format);
            System.out.print("\n");
        }
        System.out.println("================================");

    }
}
