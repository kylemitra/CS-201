import java.util.Arrays;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){

        for (int k=0; k < orders.length; k+=1) {
            String sandwich = orders[k];
            if (canMake(available,sandwich)) {
                return k;
            }
        }
        return -1;
    }

    private boolean canMake(String[] available, String sandwich){
        String[] all = sandwich.split( " ");
        for(String one : all) {
            if (! Arrays.asList(available).contains(one)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        SandwichBar sb = new SandwichBar();
        String[] av = {"cheese", "cheese", "cheese", "tomato"};
        String[] orders = {"ham ham ham", "water", "pork", "break",
                            "cheese tomato cheese", "tomato lettuce"};
        int dex = sb.whichOrder(av, orders);
        System.out.printf("index = %d\n", dex);
    }
}