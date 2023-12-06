package Java_Stack;

import java.util.NoSuchElementException;

class Node5{
	protected int data;
	protected Node5 link;
	public Node5() {
		link = null;
		data=0;
	}
	public Node5(int d,Node5 n) {
		data=d;
		link=n;
	}
	public void setlink(Node5 n) {
		link=n;
	}
	public void setdata(int d) {
		data=d;
	}
	public Node5 getlink() {
		return link;
	}
	public int getdata() {
		return data;
	}
}


 class Stack_Linked_List1 {
	protected Node5 top;
	protected int size;
	public Stack_Linked_List1() {
		top=null;
		size=0;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public int getsize() {
		return size;
	}
	public void push(int data) {
		Node5 nprt=new Node5(data,null);
		if(top==null)
			top=nprt;
		else {
			nprt.setlink(top);
			top=nprt;
		}
		size++;
	}
	public int pop() {
		if(isEmpty())
			throw new NoSuchElementException("UnderflowException");
		Node5 ptr=top;
		top=ptr.getlink();
		size--;
		return ptr.getdata();
	}
	public int peek() {
		if(isEmpty())
			throw new NoSuchElementException("UnderflowException");
		return top.getdata();
	}
	public void display() {
		System.out.print("\nStack= ");
		if(size==0) {
			System.out.print("Empty\n");
			return;
		}
		Node5 ptr=top;
		while(ptr!=null) {
			System.out.print(ptr.getdata()+" ");
			ptr=ptr.getlink();
		}
		System.out.println();
	}
 }
	public class Stack_Linked_List {
	public static void main(String[] args) { 
       
                   
     

	

	}
}