package AlgoCasts;

import java.util.Stack;

/**
 * 比如说，给你的二叉树是：

     1
   /   \
  2     2
 / \   / \
4   8 8   4

这棵二叉树是沿中轴线对称的，因此要返回 true。如果我去掉最后这个 4：

     1
   /   \
  2     2
 / \   /
4   8 8

就不对称了，这时就要返回 false。
 ******************************************
 * @author ctzeng  [2020年1月16日 下午4:43:41]
 * @version 1.0.0
 ******************************************
 */
public class 比较二叉树对称性 {
	
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	 public boolean isSymmetric(TreeNode l,TreeNode r) {
		 if(l != null && r != null) {
			 return l.val == r.val && isSymmetric(l.left, r.right)&&isSymmetric(l.right,r.left);
		 }else {
			 return l == null&& r == null;
		 }
	 } 
	 
	 public boolean isSymmetricTreeRecursive(TreeNode root) {
		 if(root == null) {
			 return false;
		 }
		 return isSymmetric(root.left,root.right);
	 }
	 
	 public boolean isSymmetricTreeIterative(TreeNode root) {
		 if(root == null) {
			 return true;
		 }
		 Stack<TreeNode> stack =new Stack<>();
		 stack.push(root.left);
		 stack.push(root.right);
		 
		 while(!stack.empty()) {
			 TreeNode l = stack.pop();
			 TreeNode s = stack.pop();
			 if(l == null && s == null) {
				 continue;
			 }
			 if(l ==null || s ==null ) {
				 return false;
			 }
			 if(l.val != s.val) {
				 return false;
			 }
			 stack.push(l.left);
			 stack.push(s.right);
			 stack.push(l.right);
			 stack.push(s.left);
		 }
		 return true;
	 }
}
