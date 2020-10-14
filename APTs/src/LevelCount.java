public class LevelCount {
    public int count(TreeNode t, int level) {
        if (t == null || level < 0) {
            return 0;
        }
        if (level == 0) {
            return 1;
        }
        else {
            return count(t.right, level-1) + count(t.left, level-1);
        }
    }
}