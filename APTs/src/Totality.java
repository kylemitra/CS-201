public class Totality {
    public int sum(int[] a, String stype) {

        int ototal = 0;
        int etotal = 0;
        for(int k=0; k < a.length; k+=1) {
            if (k % 2 == 1) {
                ototal += a[k];
            } else {
                etotal += a[k];
            }
        }
        if (stype.equals("even")) return etotal;
        else if (stype.equals("all")) return etotal + ototal;
        return ototal;
    }
}