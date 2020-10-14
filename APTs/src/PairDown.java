import java.util.ArrayList;

public class PairDown {
    public int[] fold(int[] list) {
        ArrayList<Integer> newList = new ArrayList<>();
        if (list.length%2==0) {
            for (int i=0; i < list.length; i++) {
                if (i%2 == 0) {
                    int a = list[i];
                    int b = list[i+1];
                    newList.add(a+b);
                }
            }
        }
        else {
            for (int j=0; j < list.length; j++) {
                if (j == list.length - 1) {
                    newList.add(list[j]);
                }
                else {
                    if (j%2 == 0) {
                        int c = list[j];
                        int d = list[j+1];
                        newList.add(c+d);
                    }
                }
            }
        }
        int[] finalList = newList.stream().mapToInt(i->i).toArray();
        return finalList;
    }
}