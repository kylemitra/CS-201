// Root is at level zero, children are at level one, and in general
// children of a node at level N are at level N+1
// The call evenLeveLSum(root) returns the sum of all nodes at even levels in
// the tree parameter, where root is at even level if isEvenLevel == true
// and root is NOT at an even level if isEvenLevel == false

// The call levelHelp(root, true) indicates that the global root, at level zero
// is at an even level since the second argument in the call is true

//ex: For the tree below, the call evenLevelSum(root) should return 44 since the
// nodes at even levels are 8 (level zero), 5, 10, and 22 (level 2)
//               7
//            3     15
//             5  10  22



public class evenLevelSum {
    public int evenLevelSum (TreeNode root) {
        return levelHelp(root, true);
    }
    public int levelHelp(TreeNode root, boolean isEvenLevel) {
        if (root == null) return 0;
        if (! isEvenLevel) {
            return levelHelp(root.left, true)
                    + levelHelp(root.right, true);
        }
        return root.info + levelHelp(root.left, false)
                + levelHelp(root.right, false);
    }
}
