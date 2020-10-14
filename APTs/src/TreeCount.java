public class TreeCount {
    public int count(TreeNode tree) {
        // replace with working code
        if (tree == null) {
            return 0;
        }
        int counter = 1;
        if (tree.left != null)
            counter += count(tree.left);
        if (tree.right != null)
            counter += count(tree.right);
        return counter;
    }
}