// Return number of nodes in a binary whose info field is between (and including)
// low and high


public class FilterTreeCount {
    public int count(TreeNode tree, int low, int high) {
        int counter = 0;
        if (tree == null) return 0;
        if (tree.info >= low && tree.info <= high) {
            counter += 1;
        }
        return counter + count(tree.left, low, high) + count(tree.right, low, high);
    }
}


//public class FilterTreeCount {
//    public int count(TreeNode tree, int low, int high) {
//        int counter = 0;
//        if (tree == null) return 0;
//        if (tree.left == null && tree.right == null) {
//            if (tree.info >= low && tree.info <= high) {
//                counter += 1;
//            }
//        }
//        if (tree != null)
//            if (tree.info >= low && tree.info <= high) {
//                counter += 1;
//            }
//        return counter;
//    }
//}