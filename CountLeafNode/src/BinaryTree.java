public class BinaryTree {
    public static int countLeafNode(TreeNode node){
        if (node == null) return 0;

        if (node.left == null && node.right == null) return 1;

        int leftCount = countLeafNode(node.left);
        int rightCount = countLeafNode(node.right);

        return leftCount + rightCount;
    }
}
