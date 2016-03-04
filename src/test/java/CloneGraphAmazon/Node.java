package CloneGraphAmazon;

import java.util.ArrayList;

/**
 * Created by abarabash on 3/4/16.
 */
class Node {

    int label;

    Node next;
    ArrayList<Node> neighbors = new ArrayList<>();
    boolean visited;

    Node(int x) {
        label = x;
    }

    Node(int x, ArrayList<Node> n) {
        label = x;
        neighbors = n;
    }


}
