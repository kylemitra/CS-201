//Splice method creates a copy of the first 'size' nodes of a linked list and
// splices them into the list after the first 'size' nodes so that the total
// number of nodes in the list increases by size
// list = [1, 2, 3]
// size = 2
// returns [1,2,1,2,3]
// list = [1, 2, 3, 4]
// size = 4
// returns [1,2,3,4,1,2,3,4]
// list = [2, 4, 6, 8]
// size = 3
// returns [2,4,6,2,4,6,8]

public class AddSome {
    public ListNode splice(ListNode list, int n) {
        ListNode first = new ListNode(list.info);
        ListNode last = first;
        ListNode prev = list;
        ListNode anchor = list;
        list = list.next;


        for(int k=1; k < n; k++) {
            last.next = new ListNode(list.info);
            last = last.next;
            prev = list;
            list = list.next;
        }

        last.next = list;
        prev.next = first;

        return anchor;
    }
}

