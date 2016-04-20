package Expedia;

import org.junit.Test;

import java.util.*;

/**
 * Created by abarabash on 3/22/16.
 */
public class Braces {

    public static Boolean checkBalance(String input){

        Map<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');

        if(input.length() % 2 != 0){
            return false;
        }

        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (brackets.containsKey(input.charAt(i))) {
                stack.push(input.charAt(i));
            } else if (stack.empty() || (input.charAt(i) != brackets.get(stack.pop()))) {
                return false;
            }
        }
        return true;
    }

    static String[] Braces(String[] values) {
        List<String> res = new ArrayList<>();

        for(String each:values){
            if(checkBalance(each) == true){
                res.add("YES");
            } else res.add("NO");
        }

        String[] result = res.toArray(new String[res.size()]);

        return result;

    }

    @Test
    public void test002(){
        String[] result = Braces(new String[] {"{}", "([{])"});
        print(result);

    }


    @Test
    public void test001(){
       String[] result = Braces(new String[] {"{}", "()"});
        print(result);

    }

    private void print(String[] result) {

        for(String each: result){
            System.out.println(each);
        }
    }

}
