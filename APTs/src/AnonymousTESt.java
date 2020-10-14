

public class AnonymousTESt {
    public int howMany(String[] headlines, String[] messages) {
        // fill in code here
        int result = 0;

        return 0;
    }
    private int[] getCounts(String[] strings) {
        int[] counts = new int[300];
        for (String s : strings) {
            for(char ch : s.toLowerCase().toCharArray()) {
                counts[ch] += 1;
            }
        }
    }
}