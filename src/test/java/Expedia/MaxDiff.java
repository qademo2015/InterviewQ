package Expedia;

import org.junit.Test;

/**
 * Created by abarabash on 3/22/16.
 */
public class MaxDiff {

    static int maxDifference(int[] arr) {

        int max = 0;
        int maxdiff = 0;

        if(arr.length == 0){
            return 0;
        }

        if(arr.length == 1){
           return arr[0];
        }


        for (int i = arr.length - 1 ; i >=0; i--)
        {

            if( max < arr[i])
                max=arr[i];

            int diff = max- arr[i];

            if( maxdiff < diff)
                maxdiff = diff;
        }

        return maxdiff;
    }

    @Test
    public void test001(){
        System.out.println(maxDifference(new int[] {1,2,-10,4,5,6,7}));
    }


    @Test
    public void test002(){
        System.out.println(maxDifference(new int[] {}));
    }

    @Test
    public void test003(){
        System.out.println(maxDifference(new int[] {1}));
    }

    @Test
    public void test004(){
        System.out.println(maxDifference(new int[] {1,20}));
    }




}
