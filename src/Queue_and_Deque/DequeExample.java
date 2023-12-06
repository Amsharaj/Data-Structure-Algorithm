package Queue_and_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		//Creating Deque using the ArrayDeque class
		Deque<Integer>numbers=new ArrayDeque<>();
		//add elements in deque
		numbers.offer(1);
		numbers.offerLast(2);
		numbers.offerFirst(3);
		System.out.println("Deque: "+numbers);
		//find first and last element
		int firstelement=numbers.peekFirst();
		System.out.println("First Element: "+firstelement);
		int lastelement=numbers.peekLast();
		System.out.println("Last Element: "+lastelement);
		//remove the elements
		int removednumber1=numbers.pollFirst();
		System.out.println("Removed First Number: "+removednumber1);
		int removednumber2=numbers.pollLast();
		System.out.println("Removed Last Number: "+removednumber2);
		System.out.println("Updated Deque: "+numbers);
		
	}

}
