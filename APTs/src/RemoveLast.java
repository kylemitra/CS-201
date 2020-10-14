public class RemoveLast {
    public ListNode remove(ListNode list) {

        if (list == null)
            return null;
        if (list.next == null)
            return null;

        ListNode preLast = list;
        while (preLast.next.next != null)
            preLast = preLast.next;
        preLast.next = null;

        return list;
    }
}