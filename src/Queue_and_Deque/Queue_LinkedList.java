package Queue_and_Deque;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {

	public static void main(String[] args) {
		Queue<Integer>numbers=new LinkedList<>();
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue: "+numbers);
		int accessednumber=numbers.peek();
		System.out.println("AccessedNumber: "+accessednumber);
		int removenumber=numbers.poll();
		System.out.println("RemovedNumber: "+removenumber);
		System.out.println("Updated Queue: "+numbers);
	}

}
