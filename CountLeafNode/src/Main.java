public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Call the function to count leaf nodes
        int leafCount = BinaryTree.countLeafNode(root);
        System.out.println("Number of leaf nodes: " + leafCount);  // Output: Number of leaf nodes: 4
    }
}