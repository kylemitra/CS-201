//Method trails returns an array of the binary encoded root-to-leaf paths for each
//leaf node of its tree parameter 'tree'
//Going left is encoding by a zero and going right is encoded by one
//ex: path left, left, right would be 001
// tree =                    3
//                       72       8
//                     68  85   77
//                            75  69
// returns ["00", "101", "100", "01"]

// tree = {1,2,x,x,x}
// returns =  ["0"] only to the left

// tree = {1,x,2,x,x}
// Returns ["1"] only to the right

import java.util.TreeMap;

public class LeafTrails {
    TreeMap<Integer,String> myMap = new TreeMap<>();

    public String[] trails(TreeNode t) {
        doWork(t,"");
        String[] ret = new String[myMap.size()];
        int index = 0;
        for(int s : myMap.keySet()) {
            ret[index] = myMap.get(s);
            index += 1;
        }
        return ret;
    }

    private void doWork(TreeNode t, String path) {
        if (t == null) return;

        if (t.left == null && t.right == null) {
            myMap.put(t.info, path);
            return;
        }
        doWork(t.left,path+"0");
        doWork(t.right,path+"1");
    }
}
