import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        HashMap<String, Integer> newList = new HashMap<String, Integer>();
        for(String d: data){
            if (newList.containsKey(d)){
                int i = newList.get(d);
                newList.put(d, i+1);
            }
            else{
                newList.put(d, 1);
            }
        }

        List<String> listTwo = new ArrayList<String>(newList.keySet());
        Collections.sort(listTwo);
        int[] res = new int[listTwo.size()];
        for(int i=0; i<listTwo.size(); i++){
            String word = listTwo.get(i);
            int freq = newList.get(word);
            res[i] = freq;
        }

        return res;
    }
}
