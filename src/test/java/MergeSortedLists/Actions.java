package MergeSortedLists;

/**
 * Created by abarabash on 3/14/16.
 */
public class Actions {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode fakeHead = new ListNode(0);
        ListNode p = fakeHead;

        while(p1 != null && p2 != null){

            if(p1.val <= p2.val)
            {
                p.next = p1;
                p1 = p1.next;
            }
            else
            {
                p.next = p2;
                p2 = p2.next;
            }

            p = p.next;
        }

        if(p1 != null)
        {
            p.next = p1;
            p = p.next;
            p1 = p1.next;
        }
        if(p2 != null)
        {
            p.next = p2;
            p = p.next;
            p2 = p2.next;
        }

        return fakeHead.next;
    }

    public static void printList(ListNode x) {
        if(x != null){
            System.out.print(x.val + " ");
            while (x.next != null) {
                System.out.print(x.next.val + " ");
                x = x.next;
            }
            System.out.println();
        }

    }

}
