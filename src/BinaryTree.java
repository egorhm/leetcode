/**
 * Created by Egor Hamaliy on 7/21/14.
 */
public class BinaryTree {

    TreeNode root = null;

    public void addNode(int val) {
        TreeNode node = new TreeNode(val);
        TreeNode x = root;
        TreeNode y = null;

        while (x != null) {
            y = x;

            if (val < x.val) x = x.left;
            else x = x.right;
        }

        if (y == null) root = node;
        else if (val < y.val) y.left = node;
        else y.right = node;
    }

    class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int x) { val = x; }
    }
}
