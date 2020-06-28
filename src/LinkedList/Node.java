package LinkedList;

/**
 * 手写Node类 以学生的成绩 学号 姓名为例
 ******************************************
 * @author ctzeng  [2019年12月27日 下午3:05:10]
 * @version 1.0.0
 ******************************************
 */
public class Node {
	private int data;
	private int np;
	private String name;
	private Node next;
	
	public Node(int data, int np, String name, Node next) {
		this.data = data;
		this.np = np;
		this.name = name;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getNp() {
		return np;
	}

	public void setNp(int np) {
		this.np = np;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[data:"+data+",np:"+np+",name:"+name+"]";
	}
	
	
}
