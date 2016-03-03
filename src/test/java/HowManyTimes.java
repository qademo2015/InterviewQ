import org.junit.Test;

/**
 * Created by abarabash on 2/10/16.
 */
public class HowManyTimes {

    Integer result;

    public Integer howManyTimes(String first, String second)
    {
        char[] arrFirst = first.toCharArray();
        char[] arrSecond = second.toCharArray();

        result = 0;

        for(int i = 0; i < (arrFirst.length - arrSecond.length); i++)
        {

            int res = 0;

            for(int j = 0; j < ( arrSecond.length); j ++ )
            {

                char letterFrom1 = arrFirst[j + i];

                char  letterFrom2 = arrSecond[j];


                if(letterFrom1 == letterFrom2)
                {
                    res++;
                }

                if (res == arrSecond.length)
                {
                    result++;
                }
            }
        }

        return result;
    }

    @Test
    public void test001()
    {
       String string1 = "ew";
        String string2 = "    ew";

        System.out.println(howManyTimes(string1, string2));

    }



}
