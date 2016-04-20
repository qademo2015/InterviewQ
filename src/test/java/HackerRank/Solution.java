package HackerRank;

import Expedia.Parser;

import java.util.Scanner;

/**
 * Created by abarabash on 3/22/16.
 */
public class Solution {

    public static void main(String []argh)
    {
        Parser X=new Parser();
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(X.checkParenthesisBalance(in.next()));
        }

    }
}
