public class WordLadder {
    public String ladderExists(String[] words,
                               String from, String to) {
        for (int i = 0; i < words.length; i++){
            int first = 0;
            int second = 0;
            String str = words[i];
            for (int j = 0;j < str.length(); j++){
                if (str.charAt(j) == from.charAt(j)){
                    first += 1;
                }
                if (str.charAt(j) == to.charAt(j)){
                    second += 1;
                }
            }
            if (second == (to.length()-1)){
                return "ladder";
            }
            if (first == (from.length() - 1)){
                from = str;
                words[i] = ":";
                ladderExists(words, from, to);
            }
        }
        return "none";
    }
}