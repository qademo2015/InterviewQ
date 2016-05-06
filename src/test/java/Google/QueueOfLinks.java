package Google;

import FaceBook.Friend;

/**
 * Created by abarabash on 3/3/16.
 */
public class QueueOfLinks {

    Link first, last;

    public void enqueue(Link link){
        if(first == null)
        {
            first = link;
            last = first;
        }
        else
            {
                last.next = link;
                last = link;
            }
    }

    public Link dequeue(){
        if(first == null)
        {
            return null;
        }
        else
        {
            Link temp = new Link(first.name, first.friends);
            first = first.next;
            return temp;
        }
    }
}
