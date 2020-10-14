public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int[] headlinesCount = getCounts(headlines);
        int result = 0;
        for (int i=0; i < messages.length; i++) {
            String[] sepMessages = messages[i].split(" ");
            int[] messageCount = getCounts((sepMessages));
            char character;
            int counter = 0;
            for (character = 'a'; character <= 'z'; character++) {
                if (messageCount[character] <= headlinesCount[character]){
                    counter += 1;
                }
            }
            if (counter == 26) {
                result += 1;
            }
        }
        return result;
    }

    private int[] getCounts(String[] strings) {
        int counts[] = new int[300];
        for(String s : strings) {
            for(char ch : s.toLowerCase().toCharArray()) {
                if (ch == ' ') continue;
                counts[ch] += 1;
            }
        }
        return counts;
    }
}



