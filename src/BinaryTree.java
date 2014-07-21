/**
 * Created by Egor Hamaliy on 7/21/14.
 */
public class BinaryTree {

    TreeNode root = null;

    public void addNode(int val) {
        TreeNode node = new TreeNode(val);

        if (root == null) {
            root = node;
        } else {
            while(true) {

            }

        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
