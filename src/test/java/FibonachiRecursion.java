import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by abarabash on 3/19/16.
 */
public class FibonachiRecursion {

    private static BigInteger fibonachiForward(BigInteger f1, BigInteger f2, Integer currIndex, Integer index){

        if (currIndex != index){
            if (index == 1){
                return BigInteger.valueOf(1);
            }
            if (index == 2){
                return BigInteger.valueOf(1);
            }
            else
               return fibonachiForward(f2, f1.add(f2), currIndex + 1, index);
        }

        else {
            return f2;
        }


    }

    private int fibonachirec(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return  1;
        }
        else
            return fibonachirec(n - 1) + fibonachirec(n - 2);
    }

    private long fibonachi(int n) {
        int f1 = 0;
        f1 = 1;
        if (n == 1) {
            return f1;
        }

        int f2 = 1;

        if (n == 2) {
            return f2;
        }

        int f3 = 1;

        for( int i = 3; i <=n; i ++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        return f3;

    }

     @Test
     public void test004(){
         for (int i = 1; i <100; i++) {
             System.out.println(fibonachiForward(BigInteger.valueOf(1), BigInteger.valueOf(1), 2, i));
         }
     }

    @Test
    public void test001(){

        int expected = 8;

        Assert.assertTrue(fibonachirec(6) == expected);

    }

    @Test
    public void test002(){
        for (int i = 1; i < 60; i++){
            System.out.println(fibonachirec(i));
        }
    }

    @Test
    public void test003(){
        for (int i = 1; i < 1000; i++){
            System.out.println(fibonachi(i));
        }
    }
}