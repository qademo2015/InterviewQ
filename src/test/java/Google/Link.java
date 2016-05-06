package Google;

import java.net.URL;

/**
 * Created by abarabash on 4/27/16.
 */
public class Link {

    String name;

    URL url;

    Link[] friends;

    Link next;

    Boolean visited;

    public Link(String name, Link[] friends){
        this.friends = friends;
        this.name = name;
    }


}
