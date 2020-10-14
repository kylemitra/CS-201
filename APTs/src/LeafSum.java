public class LeafSum {
    public int sum(TreeNode t) {
        // replace with working code
        int total = 0;
        if (t == null)
            return total;
        if (t.left == null && t.right == null)
            return  total + t.info;
        else
            return sum(t.left) + sum(t.right);
    }
}