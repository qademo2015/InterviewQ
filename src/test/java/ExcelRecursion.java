import org.junit.Test;

import java.util.Stack;

/**
 * Created by abarabash on 1/31/16.
 */
public class ExcelRecursion {

    Stack<String> result = new Stack<>();

    public static final String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public String column(Integer num){

        int letterNum = num % 26;
        num = (num - letterNum) / 26;

        if (letterNum == 0){
            letterNum = 26;
        }

        if (letterNum == 26) {
            num = num - 1;
        }

        if (num > 0)
            column(num);

        result.push(alphabet[letterNum]);

        return alphabet[letterNum];
    }


    @Test
    public void testColumn(){
        column(27);

        System.out.println(result);
    }

}

