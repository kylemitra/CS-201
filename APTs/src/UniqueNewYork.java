import java.util.*;

public class UniqueNewYork {
    public int seen(String[] records) {
        List<String> wordList = new ArrayList<String>();
        for (String str : records)
            for (String s : str.split(","))
                wordList.add(s);

        // List<String> wordList = Arrays.asList(records);
        Set<String> wordsWithDups = new HashSet<>(wordList);
        int count = wordsWithDups.size();
        System.out.print(wordsWithDups);
        return count; //replace with your code
    }
}