import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountWords {

    public static void countWords(String sentence)
    {
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(".", "");

        String[] strarray = sentence.split(" ");;

        Map<String, Integer> strList = new HashMap<String, Integer>();

        for (String substring : strarray)
        {
            if(strList.get(substring) == null)
            {
                strList.put(substring, 0);
            }
            if(strList.get(substring) != null)
            {
                strList.put(substring, strList.get(substring) + 1);
            }

        }

        Iterator iterator = strList.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry pair = (Map.Entry)iterator.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            iterator.remove();
        }

    }

    @Test
    public void testCountWords() {
        String str = "Today is a very sunny day. Sunny days are very nice.";

        countWords(str);

    }

}