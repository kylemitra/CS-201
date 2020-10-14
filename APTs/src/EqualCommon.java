import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EqualCommon {
    public String[] matches(String[] a1, String[] a2) {
        // change this code
        ArrayList<String> matchList = new ArrayList<String>();
        int a1Counter = 0;
        int a2Counter = 0;

        for (int i = 0; i <= a1.length; i++) {
            for (int j = 0; j <= a2.length; j++) {
                if (a1[i].equals(a2[j]))
                    for (int k = 0; k <= a1.length; k++)
                        if (a1[i].equals(a1[k]))
                            a1Counter += 1;
                    for (int l = 0; l <= a2.length; l++)
                        if (a2[j].equals(a2[l]))
                            a2Counter += 1;
                    if (a1Counter == a2Counter)
                        matchList.add(a1[i]);
            }
        }

        String[] finalList = matchList.toArray(new String[0]);
        return finalList;
    }
}