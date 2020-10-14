import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Misspelled {
    public int howMany(String[] words, String[] dictionary) {
        // write code here
        List<String> newWords = new LinkedList<String>(Arrays.asList(words));
        List<String> newDict = new LinkedList<String>(Arrays.asList(dictionary));
        newWords.removeAll(newDict);
        int ans = 0;
        ans = newWords.size();

        return ans;

//        int counter = 0;

//        for (int i = 0; i<words.length; i++)
//            for (int j = 0; j < dictionary.length; j++)
//                if (words[i] != dictionary[j])
//                    counter = counter + 1;
//
//        int ans = counter + 1;
//        return counter;
    }
}