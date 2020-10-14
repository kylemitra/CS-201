import java.util.ArrayList;
import java.util.Collections;

public class ClientsList {
    public String[] dataCleanup(String[] names) {
        ArrayList<Name> listName = new ArrayList<Name>();
        for(String s: names){
            String[] n = s.split(" ");
            if(n[0].contains(",")){
                listName.add(new Name(n[1], n[0].substring(0,n[0].length()-1)));
            }
            else{
                listName.add(new Name(n[0], n[1]));
            }
        }
        Collections.sort(listName);
        String[] sol = new String[listName.size()];
        for(int i = 0; i < listName.size(); i++){
            sol[i] = listName.get(i).toString();
        }
        return sol;
    }

    public class Name implements Comparable<Name>{
        String myFirst;
        String myLast;

        public Name(String first, String last){
            myFirst = first;
            myLast = last;
        }

        public String toString(){
            return myFirst + " " + myLast;
        }

        public int compareTo(Name arg0) {
            int last = (this.myLast).compareTo(arg0.myLast);
            if(last == 0){
                return this.myFirst.compareTo(arg0.myFirst);
            }
            return last;
        }
    }
}