package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedExample {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		//adding elements to the linked list
		list.add("Steve");
		list.add("carl");
		list.add("Raj");
		//adding element in the 1st position
		list.addFirst("Negan");
		//adding element in the last position
		list.addLast("Rick");
		//adding element in the 2nd index
		list.add(2, "Glenn");
		//System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		
		list.removeLast();
		list.remove(1);
		//Iterating Linked list
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		
		}
		
		
		

	}

}
