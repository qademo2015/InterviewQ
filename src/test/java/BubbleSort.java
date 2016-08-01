import org.junit.Test;

import java.util.Arrays;

/**
 * Created by abarabash on 5/6/16.
 */
public class BubbleSort {


    public void sortBubble(int [] array){

        int pivot = array[0];
        int pivotIndex = 0;
        boolean flag = true;


        for (int i = 0; i < array.length ; i++)
        {

               for (int j = 1; j < array.length; j++)
                {

                    if (array[i] > pivot) {

                        int temp = pivot;
                        pivot = array[i];
                        array[i] = temp;
                    }
                    else {

                    }

                }
        }

    }




    @Test
    public void test001(){

        int[] array = {8,7,6,5,4,3,2,1};

        System.out.println(Arrays.toString(array));

        sortBubble(array);

        System.out.println(Arrays.toString(array));


    }
}
