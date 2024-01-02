public class Main {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Traversal binaryTreeBFS = new Traversal();
        System.out.println("BFS traversal of the binary tree:");
        System.out.println(binaryTreeBFS.traverse(root));
    }
}