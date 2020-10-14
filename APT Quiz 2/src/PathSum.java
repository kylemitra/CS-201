//Returns 1 if there is a root-to-leaf path whose node values sum to target
//Returns 0 if there is no such root-to-leaf path

// target = 5
// tree = {5,x,x}
//Returns 1

// target = 4
// tree = {5,x,x}
//Returns 0

// target = 18
// tree = {5, 4, 11, 7, x, x, 2, x, x, x, 8, 13, x, x, 4, x, 1, x, x}
//Returns 1

// This tree is
//              5
//            4   8
//          11  13  4
//         7  2      1

// target = 20
// tree = {5, 4, 11, 7, x, x, 2, x, x, x, 8, 13, x, x, 4, x, 1, x, x}
//Returns 0

public class PathSum {
    public int hasPath(int target, TreeNode tree) {
        if (tree == null) return 0;
        if (tree.left == null && tree.right == null) {
            if (target == tree.info) return 1;
            return 0;
        }
        int left = hasPath(target-tree.info,tree.left);
        int right = hasPath(target-tree.info,tree.right);
        if (left == 1 || right == 1) return 1;
        return 0;
    }
}
