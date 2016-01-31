import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abarabash on 1/29/16.
 */
public class ShortTasks {

    @Test
    public void test001(){
        String string = "1234567890";
        for(int i =  string.length() - 1; i >= 0; i--){
            System.out.println(string.toCharArray()[i]);
        }
    }

    @Test
    public void test002(){
        String string = "12345 67890";
        for (String each : string.split(" ")){
            for(int i =  each.length() - 1; i >= 0; i--){
                System.out.print(each.toCharArray()[i]);
            }
            System.out.print(" ");
        }
    }

    @Test
    public void test003(){
        String string = "123a45 6789a0";
        char letter = 'a';
        int result = 0;

        for (char each : string.toCharArray()){
            if(each == letter){
                result++;
            }
        }
        System.out.printf(String.valueOf(result));
    }


    @Test
    public void howManyEachCharInSent() {
        String string = "The quick brown fox jumps over the lazy dog";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        string = string.toLowerCase();
        string = string.replace(" ", "");

        for (char each : string.toCharArray()) {
            if (map.containsKey(each)) {
                int value = map.get(each);
                map.put(each, (value + 1));
            } else {
                map.put(each, 1);
            }
        }

        for (Map.Entry<Character, Integer> each : map.entrySet()){
            System.out.println(each);
        }
    }

    @Test
    public void sortArrayOfZeroOnes() {
        int[] anArray = {0,1,0,0,1,1,0};
        System.out.println(Arrays.toString(anArray));

        int size = anArray.length;
        int sum = 0;
        int[] result = new int[size];

        for (int i : anArray)
            sum+=i;

        for (int i = 0; i < size-sum; i++)
            result[i] = 0;

        for (int i = size-sum; i < size ; i++)
            result[i] = 1;

        System.out.println(Arrays.toString(result));
    }

    @Test
    public void checkifPalyndrome(){
        String string = "rotator";
        System.out.println(isPal(string));
    }

    private boolean isPal(String string) {
        if (string.length() == 0 || string.length() == 1)
            return true;

        if (string.charAt(0) == string.charAt(string.length() - 1))
            return isPal(string.substring(1, string.length() - 1));

        return false;
    }

}
