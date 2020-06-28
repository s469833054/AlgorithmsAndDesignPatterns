package BTree;
/**
 * 链表构建二叉树
 ******************************************
 * @author ctzeng  [2020年1月14日 下午3:41:24]
 * @version 1.0.0
 ******************************************
 */
public class BinaryTree {
	
	/**
	 * 根节点
	 */
	public TreeNode rootNode;
	
	public BinaryTree (int data[]) {
		for(int i = 0 ; i<data.length ; i++) {
			addNodeToTree(data[i]);
		}
	}

	private void addNodeToTree(int i) {
		TreeNode currentNode = rootNode;
		//判断根节点是否为空
		if(currentNode == null) {
			rootNode = new TreeNode(i);
			return;
		}
		while(true) {
			//值比父节点小就加入左子树
			if(i<currentNode.getValue()) {
				if(currentNode.getLeftNode() == null) {
					currentNode.setLeftNode(new TreeNode(i));
					return;
				}else {
					currentNode = currentNode.getLeftNode();
				}
			}
			//值比父节点打就加入右子树
			else {
				if(currentNode.getRightNode() == null) {
					currentNode.setRightNode(new TreeNode(i));
					return;
				}else {
					currentNode = currentNode.getRightNode();
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {3,4,5,12,6,7,1,20,55,22,516,63};
		new BinaryTree(arr);
	}
}
