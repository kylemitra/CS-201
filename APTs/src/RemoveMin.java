public class RemoveMin {
    public ListNode remove (ListNode list) {
        ListNode min = list;
        ListNode first = list;
        ListNode current = null;

        while (first != null) {
            if(first.next != null && first.next.info < min.info) {
                min = first.next;
                current = first;
            }
            first = first.next;
        }

        if (min != list) {
            current.next = min.next;
        }

        else {
            list = list.next;
        }
    return list;
    }
}