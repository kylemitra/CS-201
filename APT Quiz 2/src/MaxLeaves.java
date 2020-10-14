//Height of a tree is the number of nodes on the longest/maximal root-to-lead path
//Method gather returns an array of the values in all leaves that are at a maximal
// distance from the root. The values in the returned array should be in left-to-
// right order, i.e., in the same order the maximally-distant leaves are visited
// by an in-order traversal

// tree = {8, 4, x, 6, x, x, 12, 10, x, x, 15, x, x}
// Returns [6,10,15]

//tree = {1, x, x}
// Returns [1]

//tree = {1,2,x,x,3,x,x}
//Returns [2,3]

//tree = {1,2,3,4,5,20,x,x,7,x,10,x,x,1,x,9,x,2,x,x,20,x,22,x,24,25,x,5,x,x,27,x,19,x,x}
// returns [20,10,2,5,19]


public class MaxLeaves {
    public int[] gather(TreeNode tree) {
        int listSize = 1;
        int maxHeight = height(tree);
        int[] res = new int[listSize];


        if (tree.left == null && tree.right == null)
            for (int i=0; i < listSize; i++)
                res[i] = tree.info;
            return res;
    }


    public int height(TreeNode tree) {
        if (tree == null) return 0;
        return 1 + Math.max(height(tree.left), height(tree.right));
    }
}