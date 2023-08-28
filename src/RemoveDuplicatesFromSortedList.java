//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode temp = head;
        while (temp.next !=null)
        {
            if (temp.val != temp.next.val) {
                temp = temp.next;
            }
            else temp.next = temp.next.next;
        }
        return head;
    }
}
