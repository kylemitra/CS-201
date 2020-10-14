import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Infrequent {
    public String find(String[] phrases) {
        // write code here
        Arrays.sort(phrases);
        for (int i = 0; i < phrases.length; i++)
            if (!phrases[i].equals(phrases[i].toLowerCase()))
                phrases[i] = phrases[i].toLowerCase();

        String[] newPhrases = new String[phrases.length];

        for (int j = 0; j < phrases.length; j++)
            newPhrases = phrases[j].split("\\s+");

        int currentCount = 0;
        int minCount = phrases.length + 1;
        String ans = new String();

//        for (int x = 0; x < newPhrases.length; x++)
//            if (newPhrases[x] == newPhrases[x - 1])
//                currentCount++;
//            else {
//                if (currentCount < minCount) {
//                    minCount = currentCount;
//                    ans = newPhrases[newPhrases.length];
//                }
//            }

        for (int x = 0; x < newPhrases.length; x++)
            for (int y = 0; y < newPhrases.length; y++)
                if (newPhrases[x] == newPhrases[y])
                    currentCount++;
                else if (newPhrases[x] == newPhrases[newPhrases.length])
                    currentCount = currentCount -1;
                else {
                    if (currentCount < minCount) {
                        minCount = currentCount;
                        ans = newPhrases[x];
                    }
                    currentCount = 1;
                }
        if (currentCount < minCount){
            minCount = currentCount;
            ans = newPhrases[newPhrases.length - 1];
        }

//        int n = phrases.length;
//        int minCounter = n + 1;
//        int currentConter = 1;
//        String result = new String();
//
//        for (int i = 1; i < n; i++)
//            if (phrases[i] == phrases[i - 1])
//                currentConter++;
//            else {
//                if (currentConter < minCounter) {
//                    minCounter = currentConter;
//                    result = phrases[i - 1];
//                }
//                currentConter = 1;
//            }
//        if (currentConter < minCounter) {
//            minCounter = currentConter;
//            result = phrases[n-1];
//        }

        return ans;
    }
}
