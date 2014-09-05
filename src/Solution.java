import javax.swing.tree.TreeNode;
import java.util.Stack;

/**
 * Created by Egor Hamaliy on 7/21/14.
 */
public class Solution {
    public int maxDepth(BinaryTree.TreeNode root) {
        return 0;

    }

    public void inorderTraversal(BinaryTree.TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.val);
            inorderTraversal(root.right);
        }
    }

    public void inorderNonRecursiveTraversal(BinaryTree.TreeNode root) {
        Stack<BinaryTree.TreeNode> nodesStack = new Stack<BinaryTree.TreeNode>();

        BinaryTree.TreeNode x = root;
        while (!nodesStack.empty()) {

        }
    }
}
