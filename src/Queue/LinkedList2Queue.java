package Queue;
/**
 * 链表组成消息队列
 ******************************************
 * @author ctzeng  [2019年11月22日 下午3:15:19]
 * @version 1.0.0
 ******************************************
 */
/**
 * 链表节点
 ******************************************
 * @author ctzeng  [2019年11月22日 下午3:15:43]
 * @version 1.0.0
 ******************************************
 */
class Node {
	int data; //节点数据
	Node next;	//节点指针
	Node(int data){
		this.data= data;
		this.next=null;
	}
}

class LinkedList_Queue{
	 Node front;//前端指针
	 Node rear;//后端指针
	
	public LinkedList_Queue() {
		front = null;
		rear = null;
	}
	
	//向队列添加数据 
	public void add(Node node) {
		//检查是否为空队列
		if(front == null) {
			//则加入第一个节点
			front =node ; //将前端指针指向第一个节点
			rear = node ; //后端指针指向第一个节点
		}else {
			//加入不为第一个节点，front保持不变 rear指向新节点
			rear.next=node;      //新加入的节点放入队列的尾部
			rear =node ; //将后端指针指向新加入的节点
		}
	}
	//取出数据 去除font指针 指向的节点
	public int get() {
		//检查是否为空队列
		if(front == null) {
			return -1;
		}
		//是否为最后一个节点
		else if(front == rear) {
			Node lastNode=front ;
			front =null;
			rear =null;
			return lastNode.data;
		}
		//是否为多个节点
		else{
			Node firstNode= front;
			front =front.next;
			return firstNode.data;
		}
	}
}
public class LinkedList2Queue {
	
	
	public static void main(String[] args) {
		LinkedList_Queue queue=new LinkedList_Queue();
		for(int i =1; i<6 ;i++) {
			queue.add(new Node(i));
			System.out.println(queue);
		}
		for(int i =0; i<6 ;i++) {
			System.out.println(queue.get());
		}
	}
}
