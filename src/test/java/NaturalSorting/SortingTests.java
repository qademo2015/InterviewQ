package NaturalSorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by abarabash on 3/9/16.
 */
public class SortingTests {

    @Test
    public void test001(){
        List<String> words = new ArrayList<>();
        words.add("1a2");
        words.add("1a10");
        words.add("1a8");
        words.add("1a1");

        testSorting(words);
    }

    @Test
    public void test002(){
        List<String> words = new ArrayList<>();

        words.add("z1.doc");
        words.add("z102.doc");
        words.add("z11.doc");
        words.add("z5.doc");
        words.add("z10.doc");

        testSorting(words);
    }

    public void testSorting(List<String> words){
        System.out.println("Input:\n"  + words);
        Collections.sort(words);
        System.out.println("Standard sort:\n"  + words);
        Collections.sort(words, new NaturalComparator());
        System.out.println("Natural sort:\n" + words);
    }

}
