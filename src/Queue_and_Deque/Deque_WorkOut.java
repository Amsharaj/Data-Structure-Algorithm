package Queue_and_Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class Deque_WorkOut {
	
	public static void main(String[] args) {
		Deque<String>num=new ArrayDeque<>();
		num.add("One");
		num.add("Two");
		num.add("Three");
		num.add("Four");
		num.add("Five");
		System.out.println("Elements: "+num);
		num.addFirst("Red");
		num.addLast("Blue");
		System.out.println("Elements: "+num);
		System.out.println("Peek element: "+num.peek());
        num.removeFirst();
        num.removeLast();
		System.out.println("Updated Deque: "+num);
		num.remove("Three");
		System.out.println("Elements: "+num);
		System.out.print("Elements: ");
		Iterator<String>Iterate=num.iterator();
		while(Iterate.hasNext()) {
			System.out.print(Iterate.next());
			System.out.print(",");
		}
		System.out.print("\nReverse Elements: ");
		Iterator<String>desIterate=num.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(",");
		}
		
	}

}
