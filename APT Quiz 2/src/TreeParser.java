//Turns the tree string into a TreeNode

public class TreeParser {
    int myIndex;
    String[] myValues;

    public TreeNode parse(String data) {
        //myValues = data.split("\\S+");
        myValues = data.split(", ");
        if(myValues.length == 1)
            myValues = data.split(" ");
        if(myValues.length == 1)
            myValues = data.split(",");
        myIndex = 0;
        return helper();
    }

    private TreeNode helper() {
        if (myIndex >= myValues.length) {
            return null;
        }
        if (myValues[myIndex].equals("x")) {
            myIndex++;
            return null;
        }
        int val = Integer.parseInt(myValues[myIndex]);
        myIndex++;
        TreeNode left = helper();

        TreeNode right = helper();
        return new TreeNode(val, left, right);
    }
}