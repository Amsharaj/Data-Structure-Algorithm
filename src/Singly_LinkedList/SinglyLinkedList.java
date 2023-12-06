package Singly_LinkedList;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
		public Node head=null;
		public Node tail=null;
		void addNode(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;// connecting to the newNode
				tail=newNode;//moving the tail
		}
	}
		 void addFirst(int data) {
			 Node newNode = new Node(data);
				if(head==null) {
					head=newNode;
					tail=newNode;
				}
				else {
					
					newNode.next=head;// connecting to the newNode
					head=newNode;}
		    }
		 
		 void addLast(int data) {
			 Node newNode = new Node(data);
			// Node current=head;
			 if(head==null) {
				 head=newNode;
				 tail=newNode;
			 }
			 else {
				/*while(current.next!=null) {
					 current=current.next;
				 }
				 current.next=newNode; */
				 tail.next=newNode;
				 tail=newNode;
			 }
		 }
		 void addBetween(int pos,int data) {
			 Node newNode = new Node(data);
		  Node current=head;
				if(head==null) {
					head=newNode;
					tail=newNode;
				}
				else {
					while(current.data!=pos) {
						current=current.next;
					}
					newNode.next=current.next;
					current.next=newNode;
				}
		 }
		public void display() {
			Node current = head;
			if(current==null) {
				System.out.println("LinkedList is Empty");
			}
			else {
				System.out.println("Signly Linked List Elements are: ");
				while(current!=null) {
					System.out.print(current.data+" ");
					current=current.next;
				}
			}
		}

	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		
		sll.addNode(10);
	    sll.addNode(5);
		sll.addNode(20);
		sll.addFirst(12);
		sll.addLast(100);
		sll.addNode(120);
		sll.addBetween(120, 500);
	    sll.display();

	}

}
