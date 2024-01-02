import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Traversal {
    public List<List<Integer>> traverse(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();

        boolean leftToRight = true;

        queue.add(root);

        while (! queue.isEmpty() ){
            List<Integer> levelList = new ArrayList<>();

            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++){
                TreeNode node = queue.poll();

                if (leftToRight){
                    levelList.add(node.val);
                } else {
                    levelList.add(0, node.val);
                }

                if (node.left != null){
                    queue.add(node.left);
                }

                if (node.right != null){
                    queue.add(node.right);
                }
            }

            result.add(levelList);
            leftToRight = !leftToRight;

        }

        return result;
    }
}
