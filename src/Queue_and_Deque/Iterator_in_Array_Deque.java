package Queue_and_Deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Iterator_in_Array_Deque {

	public static void main(String[] args) {
		ArrayDeque<String>animals=new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		animals.add("Hen");
		animals.add("Tiger");
		animals.add("Lion");
		System.out.println("Array Deque: "+animals);
		//Iterator in Array Deque
		System.out.println("Array Deque: ");
		Iterator<String>iterate=animals.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.println("\nArray Deque in Reverse order: ");
		Iterator<String>desIterate=animals.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(", ");
		}
	}

}
