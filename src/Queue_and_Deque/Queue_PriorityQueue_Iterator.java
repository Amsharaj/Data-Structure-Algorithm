package Queue_and_Deque;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue_Iterator {

	public static void main(String[] args) {
		Queue<Integer>numbers=new PriorityQueue<>();
		numbers.offer(5);
		numbers.offer(1);
		numbers.offer(2);
//Priority queue using iterator
		System.out.print("Priority queue using iterator():");
		Iterator <Integer>iterate=numbers.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(",");
		}

	}

}
