package Doubly_Linked_List;

public class DoublyLinkedList {
	class Node{
		public int data;
		public Node next;
		public Node prev;
		public Node(int data) {
			this.data=data;
			//this.prev=prev;
			//this.next=next;
		}
	}
	
	Node head=null;
	Node tail=null;
	//add front 
	public void addNodeFront(int val) {
		Node temp=new Node(val);
		if(head!=null) {
			head.prev=temp;
			temp.next=head;
		}
		head=temp;
		if(tail==null) 
			tail=temp;
		}
	//add back
	public void addNodeBack(int val) {
		Node temp=new Node(val);
		if(tail!=null) {
			tail.next=temp;
			temp.prev=tail;
		}
		tail=temp;
		if(head==null) {
			head=temp;
		}
		System.out.println("New node added at the End: "+val);
	}
	//remove front
	public void removeNodeFront() {
		Node temp=head;
		head=head.next;
		head.prev=null;
		System.out.println("deleted: "+temp.data);
	
	}
	//remove back
	public void removeNodeBack() {
		Node temp=tail;
		tail=tail.prev;
		tail.next=null;
		System.out.println("deleted back: "+temp.data);}
		public void iterateForward(){
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
	public void iterateBackwark() {
		Node temp=tail;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.prev;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.addNodeFront(2);
		dll.addNodeFront(100);
		dll.addNodeBack(1200);
		dll.addNodeBack(2000);
		dll.addNodeBack(500);
		System.out.println("Before remove: ");
		dll.iterateForward();
		dll.removeNodeFront();
		System.out.println("Remove front: ");
		dll.iterateForward();
		dll.removeNodeBack();
		System.out.println("Remove back: ");
		dll.iterateForward();
		System.out.println("Iterate Backwark: ");
		dll.iterateBackwark();

	}

}
