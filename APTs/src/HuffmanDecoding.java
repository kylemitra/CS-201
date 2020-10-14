import java.util.*;

public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        String word = "";
        HashMap<String, String> myMap = new HashMap<>();

        for (int i =0; i<dictionary.length; i++){
            char let = (char)('A'+i);
            myMap.put(dictionary[i], let+"");
        }

        int start = 0;
        int iter = 0;

        while (start+iter <= archive.length()) {
            String bit = archive.substring(start, start+iter);
            if (myMap.containsKey(bit)) {
                word += myMap.get(bit);
                start = start + iter;
                iter = 1;
            }
            else {
                iter++;
            }
        }

        return word;
    }
}