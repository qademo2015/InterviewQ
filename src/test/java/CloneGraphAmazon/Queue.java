package CloneGraphAmazon;

/**
 * Created by abarabash on 3/4/16.
 */
class Queue {
    Node first, last;

    public void enqueue(Node n) {
        if (first == null) {
            first = n;
            last = first;
        } else {
            last.next = n;
            last = n;
        }
    }

    public Node dequeue() {
        if (first == null) {
            return null;
        } else {
            Node temp = new Node(first.label, first.neighbors);
            first = first.next;
            return temp;
        }
    }
}
