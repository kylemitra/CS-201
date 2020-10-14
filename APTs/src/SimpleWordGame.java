public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {

        int ret = 0;
        for(String s : set) {
            ret += s.length()*s.length();
        }
        return ret;
    }
}