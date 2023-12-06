package Singly_LinkedList;

public class Work_Out {
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
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
		tail=newNode;
		}
	}
	void addNodeBeginning(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	void addNodeLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	@SuppressWarnings("unused")
	void deleteNodeFront() {
		if(head==null)
			return;
		Node temp=head;
		head=head.next;
		//System.out.println("Deleted: "+temp.data);
	}
	void deleteNodeBack() {
		 if(head==null) {
			 return;
		 }
		 else {
			 if(head!=tail) {
				 Node current=head;
				 while(current.next!=tail) {
					 current=current.next;
				 }
				 tail=current;
				 tail.next=null;
			 }
			 else {
				 head=tail=null;
			 }
		 }
	}
	
	
	//ANOTHER METHOD TO DELETE BACK
	/*{Node temp=head;
	if(head==null)
		System.out.println("List is Empty");
	else {
		while(temp.next!=tail) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
	}
	}*/
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
	void deleteElement(int data) {
		Node temp=head;
		if(head==null) 
			System.out.println("List is Empty");
		
		else {
			while(temp.next.data!=data) {
				temp=temp.next;
			}
			if(temp.next==null)
				System.out.println("The element is not presented in the list");
			else {
				temp.next=temp.next.next;
			}
		}
		
	}
	void Print() {
		Node current=head;
		if(current==null) {
			System.out.println("Linked List is Empty");
		}
		else {
			System.out.println("Linked List: ");
			while(current!=null) {
				System.out.println(current.data+" ");
				current=current.next;
			}
		}
	}

	public static void main(String[] args) {
		Work_Out n=new Work_Out();
		n.addNode(2);
		n.addNode(4);
		n.addNodeBeginning(6);
		n.addNodeLast(10);
		n.addNode(12);
        n.Print();
        n.deleteNodeFront();
        n.Print();
        n.deleteNodeBack();
        n.Print();
        n.addBetween(2,50);
        n.deleteElement(4);
        n.Print();
	}

}
