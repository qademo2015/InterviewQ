import org.junit.Test;

import java.util.HashMap;

/**
 * Created by abarabash on 1/29/16.
 */
public class MakeFriends {

    private HashMap<String, String> peopleHash = new HashMap<String, String>();

    public MakeFriends() {
            peopleHash.put("Igor", "Igor");
            peopleHash.put("Aleksei", "Aleksei");
            peopleHash.put("Andrei", "Andrei");
            peopleHash.put("Vanya", "Vanya");

    }
    private String root(String index) {
        while (!index.equals(peopleHash.get(index)))
            index = peopleHash.get(index);

        return index;
    }

    public boolean isFriends(String p, String q) {
        return root(p) == (root(q));
    }

    public void make_friends(String name1, String name2)
    {
        String i = root(name1);
        String j = root(name2);
        peopleHash.put(i, j);
    }
    public boolean direct_friends(String name){
        return true;
    }

    @Test
    public void Test001(){
        System.out.println(peopleHash.toString());
        System.out.println(isFriends("Igor", "Aleksei"));
        make_friends("Igor", "Aleksei");
        System.out.println(isFriends("Igor", "Aleksei"));
        System.out.println(peopleHash.toString());
    }
}

