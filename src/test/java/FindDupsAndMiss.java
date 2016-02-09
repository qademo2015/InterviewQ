import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * Created by abarabash on 2/1/16.
 */

public class FindDupsAndMiss {

    private int array[];
    private int length;

    public int[] arrayOf100 = new int[100];

    Random randomGenerator = new Random();

    public void createArray1to100(int[] arrayOf100) {

        for (int i = 0; i < arrayOf100.length; i++) {
            arrayOf100[i] = randomGenerator.nextInt(100);
        }
    }

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }


    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);

                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static Integer findduplicates(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {

                result = (array[i + 1]);

            }
        }

        return result;
    }

    public static Integer findmissing(int... array) {

        int result = 0;

        for (int i = 0; i < (array.length - 1); i++) {

            if ((array[i + 1] - array[i]) != 1) {
                result = (array[i] + 1);
            }
        }
        return result;
    }


    @Test
    public void testCheckArray() {
        createArray1to100(arrayOf100);

        System.out.println((Arrays.toString(arrayOf100)));
    }

    @Test
    public void testSorting() {
        createArray1to100(arrayOf100);

        System.out.println((Arrays.toString(arrayOf100)));

        sort(arrayOf100);

        System.out.println((Arrays.toString(arrayOf100)));
    }

    @Test
    public void testDuplicates() {

        int[] array = new int[]{1, 2, 3, 4, 5, 5};

        int duplicate = findduplicates(array);

        System.out.println(duplicate);

        assertTrue(duplicate == 5);
    }

    @Test
    public void testfindmissing() {
        int[] array = new int[]{1, 2, 3, 4, 5, 7, 8, 9};

        int missing = findmissing(array);

        System.out.println(missing);

        assertTrue(missing == 6);

    }
}

