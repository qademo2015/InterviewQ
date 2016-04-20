import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by abarabash on 1/30/16.
 */
public class NetflixRemote {

    public String wordToType;

    private ArrayList<Integer[]> wordIndex = new ArrayList<Integer[]>();

    HashMap<Character, Integer[]> keyboard = new HashMap<Character, Integer[]>();

    String

    Integer[] currentPostion = new Integer[] {1,1};

    public void createaKeyboard(){

        keyboard.put('A',new Integer[] {1, 1});
        keyboard.put('B',new Integer[] {1, 2});
        keyboard.put('C',new Integer[] {1, 3});
        keyboard.put('D',new Integer[] {1, 4});
        keyboard.put('E',new Integer[] {2, 1});
        keyboard.put('F',new Integer[] {2, 2});
        keyboard.put('G',new Integer[] {2, 3});
        keyboard.put('H',new Integer[] {2, 4});
        keyboard.put('I',new Integer[] {3, 1});
        keyboard.put('J',new Integer[] {3, 2});
        keyboard.put('K',new Integer[] {3, 3});
        keyboard.put('L',new Integer[] {3, 4});
        keyboard.put('M',new Integer[] {4, 1});
        keyboard.put('N',new Integer[] {4, 2});
        keyboard.put('O',new Integer[] {4, 3});
        keyboard.put('P',new Integer[] {4, 4});
        keyboard.put('Q',new Integer[] {5, 1});
        keyboard.put('R',new Integer[] {5, 2});
        keyboard.put('S',new Integer[] {5, 3});
        keyboard.put('T',new Integer[] {5, 4});
        keyboard.put('U',new Integer[] {6, 1});
        keyboard.put('V',new Integer[] {6, 2});
        keyboard.put('W',new Integer[] {6, 3});
        keyboard.put('X',new Integer[] {6, 4});
        keyboard.put('Y',new Integer[] {7, 1});
        keyboard.put('Z',new Integer[] {7, 2});
    }

    public void inputFilter(){
        wordToType = wordToType.toUpperCase();
    }

    //Integer wordSize = wordToType.length();

    public void wordConvertToIndexes(String wordToType){
        for (Character each : wordToType.toCharArray()) {
            String eachclass = each.getClass().getName();
            Integer[] character = keyboard.get(each);
            wordIndex.add(character);
        }
    }

    public void printOutActions(){
        for(Integer[] targetPosition : wordIndex){
            int x;
            int y;

            x = targetPosition[0] - currentPostion[0];
            y = targetPosition[1] - currentPostion[1];

            if (x >= 0){
                while (x > 0){
                    System.out.println("down");
                    x--;}
            }
            else {
                while (x < 0) {
                    System.out.println("up");
                    x++;}
            }

            if (y >= 0){
                while (y > 0) {
                    System.out.println("right");
                    y--;}
            }
            else {
                while (y < 0) {
                    System.out.println("left");
                    y++;}
            }

            System.out.println("ENTER");

            currentPostion = targetPosition;
        }
    }

    @Test
    public void test0001(){
        createaKeyboard();
        wordToType = "ALEKS";
        inputFilter();
        wordConvertToIndexes(wordToType);
        printOutActions();
    }
}
