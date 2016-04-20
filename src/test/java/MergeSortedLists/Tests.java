package MergeSortedLists;

import org.junit.Test;

import java.util.*;

/**
 * Created by abarabash on 3/14/16.
 */
public class Tests {

    public void printList(List<Integer> list){
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void test001(){

        List<Integer> list1 = Arrays.asList(2,3,1,4,6,5,7,8);
        printList(list1);
        List<Integer> list2 = Arrays.asList(12,13,11,14,16,15,17,18);
        printList(list2);

        Collections.sort(list1);
        Collections.sort(list2);
    }

    @Test
    public void test002(){

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(10);
        ListNode listNode4 = new ListNode(11);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        Actions.printList(listNode1);

        ListNode listNode10 = new ListNode(13);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(12);
        ListNode listNode13 = new ListNode(3);

        listNode10.next = listNode11;
        listNode11.next = listNode12;
        listNode12.next = listNode13;

        Actions.printList(listNode10);

        ListNode merged = Actions.mergeTwoLists(listNode1, listNode10);

        Actions.printList(merged);
    }
}
