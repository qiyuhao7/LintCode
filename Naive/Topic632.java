package Naive;
import Public.TreeNode;
public class Topic632 {
    public TreeNode maxNode(TreeNode root) {
        if (root == null) return root;
        TreeNode leftMaxNode = maxNode(root.left);
        TreeNode rightMaxNode = maxNode(root.right);
        TreeNode resNode = root;
        if(leftMaxNode != null && leftMaxNode.val > resNode.val){
            resNode = leftMaxNode;
        }
        if(rightMaxNode != null && rightMaxNode.val > resNode.val){
            resNode = rightMaxNode;
        }
        return resNode;
    }
}
