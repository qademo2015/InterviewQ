/**
 * Created by Ivan on 1/30/2016.
 */
public class FizzBuzz {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            // For each iteration,
            // initialize an empty string
            String str = "";

            // If `i` is divisible by 3
            // with no remainder, append `Fizz`
            if (i % 3 == 0) {
                str += "Fizz";
            }

            // If `i` is divisible by 5
            // with no remainder, append `Buzz`
            if (i % 5 == 0) {
                str += "Buzz";
            }

            if(i % 15 == 0)
            {
                str += "FIZZBIZZ";
            }

            // If `string` is still empty,
            // `i` is not divisible by 3 or 5,
            // so use the number instead.
            System.out.println(str);

        }
    }
}
