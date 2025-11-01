import java.util.*;

class _01 {
    static ListNode modifiedList(int[] nums, ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }

        while(curr != null){
            if(hs.contains(curr.val)){
                if(prev != null){
                    prev.next = curr.next;
                } else {
                    head = curr.next;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] toRemove = {6};
        int[] values = {1, 2, 6, 3, 4, 5, 6};

        ListNode head = buildList(values);
        System.out.println("Original list: " + toString(head));

        ListNode modified = modifiedList(toRemove, head);
        System.out.println("After removing " + Arrays.toString(toRemove) + ": " + toString(modified));

        int[] toRemove2 = {1, 3};
        head = buildList(values);
        System.out.println("\nOriginal list: " + toString(head));
        modified = modifiedList(toRemove2, head);
        System.out.println("After removing " + Arrays.toString(toRemove2) + ": " + toString(modified));
    }

    static ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : vals) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    static String toString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode cur = head;
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append("->");
            cur = cur.next;
        }
        return sb.toString();
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
