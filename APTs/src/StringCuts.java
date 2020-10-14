import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        Set<String> dataSet = new LinkedHashSet<>();
        for (String fullSet : list)
            dataSet.add(fullSet);
        String[] newArray = (String[]) dataSet.toArray(new String[dataSet.size()]);
        List<String> finalList = new ArrayList<String>();
        for (int k = 0; k < newArray.length; k++) {
            if (newArray[k].length() >= minLength) {
                finalList.add(newArray[k]);
            }
        }
        String [] answer = finalList.toArray(new String[finalList.size()]);
        return answer;
    }
}