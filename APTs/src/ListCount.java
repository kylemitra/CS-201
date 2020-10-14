public class ListCount {
    public int count (ListNode list) {
        int total = 0;
        while (list != null) {
            total = total + 1;
            list = list.next;
        }
        return total;
    }
}