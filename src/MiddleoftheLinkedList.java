public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        size /= 2;
        int i =0;
        while(i < size){
            head = head.next;
            i++;
        }
        return head;
    }
}
