import java.util.ArrayList;
import java.util.Collections;

public class Dirsort {
    public String[] sort(String[] dirs) {
        ArrayList<Url> first = new ArrayList<Url>();
        String[] result = new String[dirs.length];

        for (int i = 0 ; i <dirs.length;i++){
            String[] parts = dirs[i].split("/");
            int len = parts.length;
            Url next = new Url(dirs[i],len);
            first.add(next);
        }

        Collections.sort(first);
        for (int j = 0; j < first.size(); j++) {
            result[j] = first.get(j).toString();
        }
        return result;
    }

    public class Url implements Comparable<Url>{
        private String ipAdd;
        private int len;

        public Url(String web, int length){
            ipAdd = web;
            len = length;
        }

        public String toString(){
            return ipAdd;
        }

        public int compareTo(Url o) {
            int temp = Double.compare(this.len, o.len);
            if(temp == 0){
                return (this.ipAdd).compareTo(o.ipAdd);
            }
            return temp;
        }
    }
}