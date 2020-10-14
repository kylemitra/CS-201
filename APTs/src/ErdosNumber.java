import java.util.*;

public class ErdosNumber {
    public String[] calculateNumbers(String[] pubs) {
        HashMap<String, HashSet<String>> myGraph = new HashMap<String, HashSet<String>>();
        for(String pub: pubs){
            String[] authors = pub.split(" ");
            for(String author : authors){
                if(!myGraph.containsKey(author))
                    myGraph.put(author, new HashSet<String>());
                for(String authors2 : authors){
                    if(!authors2.equals(author))
                        myGraph.get(author).add(authors2);
                }
            }
        }

        HashMap<String, Integer> distance = new HashMap<String, Integer>();
        distance.put("ERDOS", 0);
        LinkedList<String> q = new LinkedList<String>();
        HashSet<String> S = new HashSet<String>();
        q.add("ERDOS");

        while(!q.isEmpty()){
            String current = q.pop();
            if(!S.contains(current)){
                S.add(current);
                for(String neighbor : myGraph.get(current)){
                    if(!distance.containsKey(neighbor)){
                        distance.put(neighbor, distance.get(current)+1);
                        q.add(neighbor);
                    }
                }
            }
        }

        String[] authors = new String[myGraph.size()];
        myGraph.keySet().toArray(authors);
        String[] output = new String[authors.length];
        for(int i = 0; i < output.length; i++){
            if(distance.get(authors[i]) == null)
                output[i] = authors[i];
            else
                output[i] = authors[i] + " " + distance.get(authors[i]);
        }
        Arrays.sort(output);
        return output;
    }
}