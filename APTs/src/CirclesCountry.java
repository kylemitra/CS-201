public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r,
                            int x1, int y1, int x2, int y2) {

        int number = x.length;
        int count = 0;
        for (int i = 0; i < number; i++)

        {
            boolean first = (x[i] - x1)*(x[i] - x1) + (y[i] - y1)*(y[i] - y1) < r[i]*r[i];
            boolean second = (x[i] - x2)*(x[i] - x2) + (y[i] - y2)*(y[i] - y2) < r[i]*r[i];

            if ((first && !second) || (!first && second))
                count++;
        }

        return count;
    }


}