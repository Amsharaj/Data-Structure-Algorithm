package Queue_and_Deque;

import java.util.ArrayDeque;

public class Remove_Elements_deque {

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
		//remove first elements
		String elements=animals.remove();
		System.out.println("Removed Elements: "+elements);
		System.out.println("New Array Deque: "+animals);
		//remove specific elements
		//System.out.println("Removed Specific Elements: "+animals.remove("Cat"));
		animals.remove("Cat");
		System.out.println("New Array Deque: "+animals);
		//Remove First
		String firstelements=animals.removeFirst();
		System.out.println("Removed First Elements: "+firstelements);
		System.out.println("New Array Deque: "+animals);
		//remove Last
		String lastelements=animals.removeLast();
		System.out.println("Removed Last Elements: "+lastelements);
		System.out.println("New Array Deque: "+animals);
		animals.clear();
		System.out.println("New Array Deque: "+animals);
	}

}
