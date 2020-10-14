public class BSTcount {
    long[] counts;

    public long howMany(int[] values) {
        int num = values.length;
        counts = new long[num + 1];
        counts[0] = 1;

        for (int i = 1; i <= num; i++) {
            counts[i] = bst(i);
        }
        return counts[num];
    }

    public long bst(int n) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            count += counts[i] * counts[n - i - 1];
        }
        return count;
    }
}