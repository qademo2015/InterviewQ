package Expedia;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by abarabash on 3/22/16.
 */
public class Parser {

    public Boolean checkParenthesisBalance(String input){

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





    @Test
    public void test001(){
       Assert.assertTrue(checkParenthesisBalance("(){}"));
    }

    @Test
    public void test002(){
        Assert.assertTrue(checkParenthesisBalance("({()})"));
    }

    @Test
    public void test003(){
        Assert.assertFalse(checkParenthesisBalance("{}("));
    }

}




