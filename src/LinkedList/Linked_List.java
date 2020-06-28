package LinkedList;

/**
 * 手写链表
 ******************************************
 * @author ctzeng  [2019年12月27日 下午3:04:57]
 * @version 1.0.0
 ******************************************
 */
public class Linked_List {
	
	private Node first;
	
	private Node last;
	
	public boolean isEmpty() {
		return first  == null;
	}
	
	public void print() {
		Node current = first;
		while(current != null) {
			System.out.println(current.toString());
			current = current.getNext();
		}
	}
	
	public void insert(Node newNode) {
		if(this.isEmpty()) {
			first = newNode ;
			last = newNode;
		}else {
			last.setNext(newNode);
			last = newNode;
		}
	}
	
	public void delete(Node delNode) {
		Node newNode= null;
		//判断当前链表是否为空
		if(this.isEmpty()) {
			//为空则删除失败
			return;
		}
		//判断当前节点是否是第一个节点
		if(first.getData() == delNode.getData()) {
			first  = first.getNext();
		}else if(last.getData() == delNode.getData()){
			newNode = first;
			//找到最后一个节点
			while(newNode.getNext() != last) {
				newNode = newNode.getNext();
			}
			//将最后一个节点的值复制给newNode
			newNode.setNext(last.getNext());
			last = newNode;
		}else {
			
		}
	}
}
