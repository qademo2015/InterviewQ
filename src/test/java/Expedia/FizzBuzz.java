package Expedia;

import org.junit.Test;

/**
 * Created by Ivan on 1/30/2016.
 */
public class FizzBuzz {

    public static void fizzBuzz(int arg) {

        for (int i = 1; i <= arg; i++) {

            String str = "";

            if (i%3 == 0 || i%5 == 0) {
                if (i % 3 == 0) {
                    str += "Fizz";
                }

                if (i % 5 == 0) {
                    str += "Buzz";
                }
                System.out.println(str);
            } else {
                System.out.println(i);
            }
        }
    }

    @Test
    public void test001(){
        fizzBuzz(20);
    }
}
