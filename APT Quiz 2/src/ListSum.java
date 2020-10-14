//Returns the sum of the values greater than 'thresh' in its list parameter
//where list is a linked list of int values

// list = [1,2,3,4,5,6]
// thresh = 4
// returns 11

// list = []
// thresh = 22
// returns 0

// list = [1,2,3,4,5,6,7,8,9,10]
// thresh = -22
// returns 55

public class ListSum {
    public int sumIter(ListNode list, int thresh) {
        int total = 0;
        while (list != null) {
            if (list.info >= thresh) {
                total += list.info;
            }
            list = list.next;
        }
        return total;
    }

    public int sum(ListNode list, int thresh) {
        if (list == null) return 0;

        int recSum = sum(list.next,thresh);
        if (list.info <= thresh) return recSum;
        return list.info + recSum;
    }
}
