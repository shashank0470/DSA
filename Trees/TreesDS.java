package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreesDS {
    class TreeNode<E>{
        E data;
        TreeNode left;
        TreeNode right;

        public TreeNode(E data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {

    }

    public ArrayList<Integer> BFS(TreeNode<Integer> root){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(queue!=null){
            TreeNode<Integer> node = queue.poll();
            res.add(node.data);

            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }

    }
}
