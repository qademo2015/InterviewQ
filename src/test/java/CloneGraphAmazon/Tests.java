package CloneGraphAmazon;


import org.junit.Test;

/**
 * Created by abarabash on 3/4/16.
 */
public class Tests {

    @Test
    public void test001(){

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node2.neighbors.add(node3);
        node3.neighbors.add(node4);

        Node clonedNode1 = Actions.cloneGraph(node1);

        Actions.printOutUsingBreathFirstSearch(clonedNode1);

    }

}
