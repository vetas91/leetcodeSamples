package tasks;

import java.util.ArrayList;
import java.util.List;

public class MiddleLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        List<ListNode> list = new ArrayList<>();
        list.add(current);
        while (current.next != null) {
            current = current.next;
            list.add(current);
        }

        return list.size() <= 1 ? head : list.get(list.size()  / 2);
    }

    public ListNode middleNodeFast (ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while (end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
