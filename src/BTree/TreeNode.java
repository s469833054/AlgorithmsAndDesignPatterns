package BTree;

/**
 * 二叉树节点类
 ******************************************
 * @author ctzeng  [2020年1月14日 下午3:40:28]
 * @version 1.0.0
 ******************************************
 */
public class TreeNode {
	private int value;
	
	private TreeNode leftNode;
	
	private TreeNode rightNode;
	
	public TreeNode(int value) {
		this.value = value;
		this.leftNode = null;
		this.rightNode = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
}
