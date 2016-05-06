import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountWords {



    public static void printMap(Map<String, Integer> stringMap){
        Iterator iterator = stringMap.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry pair = (Map.Entry)iterator.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            iterator.remove();
        }
    }


    public static void countWords(String sentence)
    {
        sentence = sentence.toLowerCase();

        String[] strarray = sentence.split(" ");

        String fvfsg = "fdsgadg";
        fvfsg.toCharArray();

        Map<String, Integer> strList = new HashMap<String, Integer>();

        for (String substring : strarray)
        {
            substring = substring.replaceAll("\\W", "");

            if(strList.get(substring) == null)
            {
                strList.put(substring, 0);
            }
            if(strList.get(substring) != null)
            {
                strList.put(substring, strList.get(substring) + 1);
            }

        }

        printMap(strList);
    }


    @Test
    public void testCountWords001() {
        String str = "Today is a very sunny day. Sunny days are very nice.";

        countWords(str);
    }

    @Test
    public void testCountWords002() {
        String str = "Toda$y is a^ very sunny& day. Sun$ny days? are very nice.";

        countWords(str);
    }


}