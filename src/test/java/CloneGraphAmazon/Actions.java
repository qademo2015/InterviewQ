package CloneGraphAmazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by abarabash on 3/4/16.
 */
public class Actions {

    public static void printOutUsingBreathFirstSearch(Node root)
    {
        System.out.println(root.label + ": ");

        Queue queue = new Queue();
        root.visited = true;
        queue.enqueue(root);

        while (queue.first != null) {
            Node c = (Node) queue.dequeue();
            for (Node n : c.neighbors) {
                System.out.print("->");

                if (!n.visited) {
                    System.out.print(n.label);
                    n.visited = true;

                    queue.enqueue(n);
                }
            }
        }
    }

    public static void breathFirstSearch(Node root, int x) {
        if (root.label == x)
            System.out.println("find in root");

        Queue queue = new Queue();
        root.visited = true;
        queue.enqueue(root);

        while (queue.first != null) {
            Node c = (Node) queue.dequeue();
            for (Node n : c.neighbors) {

                if (!n.visited) {
                    System.out.print(n + " ");
                    n.visited = true;
                    if (n.label == x)
                        System.out.println("Find " + n);
                    queue.enqueue(n);
                }
            }
        }
    }

    public static Node cloneGraph(Node node) {
        if (node == null)
            return null;

        LinkedList<Node> queue = new LinkedList<Node>();

        HashMap<Node, Node> map =
                new HashMap<Node, Node>();

        Node newHead = new Node(node.label);

        queue.add(node);
        map.put(node, newHead);

        while (!queue.isEmpty()) {
            Node curr = queue.pop();
            ArrayList<Node> currNeighbors = curr.neighbors;

            for (Node aNeighbor : currNeighbors) {
                if (!map.containsKey(aNeighbor)) {
                    Node copy = new Node(aNeighbor.label);
                    map.put(aNeighbor, copy);
                    map.get(curr).neighbors.add(copy);
                    queue.add(aNeighbor);
                } else {
                    map.get(curr).neighbors.add(map.get(aNeighbor));
                }
            }

        }
        return newHead;
    }

}
