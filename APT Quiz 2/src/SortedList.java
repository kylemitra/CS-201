import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedList {
    public ListNode create(String[] words) {
        if (words.length == 1)
            return new ListNode(0);

        ListNode first = new ListNode(-1);
        ListNode last = first;

        String[] sortedWords = words.clone();
        Arrays.sort(sortedWords, String.CASE_INSENSITIVE_ORDER);
        List<String> sortedWordsList = Arrays.asList(sortedWords);
        System.out.print(sortedWordsList);

        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i]);
            if (first.info == -1) {
                first.info = sortedWordsList.indexOf(words[i]);
            }
            else {
                last.info = sortedWordsList.indexOf(words[i]);
            }
            if (last.info != sortedWordsList.indexOf(words[words.length-1]))
                last.next = new ListNode(2);
                last = last.next;
        }
        return first;
    }
}