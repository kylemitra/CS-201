//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class FriendScore {
//    public int highestScore(String[] friends) {
//        // you fill in code here
//        ArrayList<HashSet<Integer>> info = new ArrayList<>();
//        for (int i = 0; i<friends.length; i++)
//            info.add(new HashSet<>());
//            for (int j=0; j<friends[i].length(); j++)
//                if (friends[i].charAt(j) == 'Y')
//                    info.get(i).add(j);
//        int max = 0;
//        for (int i=0; i < info.size(); i++)
//            int j = twoFriends(i, info);
//            if (j > max)
//                max = j;
//
//        return max;
//    }
//
//    private Set<Integer> twoFriends(int index) {
//        Set<Integer> set = new TreeSet<>();
//        Set<Integer> friends = myGraph.get(index);
//        set.addAll(friends);
//        for (int friend: friends) {
//
//    }
//
import java.util.HashSet;
import java.util.Set;

public class FriendScore {
    public int highestScore(String[] friends) {
        int best = 0;
        for (int i=0;i<friends.length;i++){
            String flist = friends[i];
            Set<Integer> numTimes = new HashSet<Integer>();
            for (int j=0; j < flist.length();j++){
                if (flist.charAt(j) == ('Y')){
                    numTimes.add(j);
                    for (int k=0; k < flist.length();k++){
                        if ((k != i) && (k != j)){
                            if((flist.charAt(k) == 'N') && (friends[j].charAt(k) == 'Y' )){
                                numTimes.add(k);
                            }
                        }
                    }
                }
            }
            if (numTimes.size() > best){
                best = numTimes.size();
            }
        }
        return best;
    }

    public int twoFriends(String first, String second, int index1, int index2){
        int count = 0;
        for (int j = 0; j <first.length(); j++){
            if ((j != index1) && (j != index2)){
                if((first.charAt(j) == 'N') && (second.charAt(j) == 'Y')){
                    count += 1;
                }
            }
        }
        return count;
    }

}