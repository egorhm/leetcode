import java.util.List;

/**
 * Created by Egor Hamaliy on 7/21/14.
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(18);
        binaryTree.addNode(2);
        binaryTree.addNode(1);

        binaryTree.addNode(100);
        binaryTree.addNode(9);
        binaryTree.addNode(15);
        binaryTree.addNode(19);

        new Solution().inorderTraversal(binaryTree.root);
    }
}
