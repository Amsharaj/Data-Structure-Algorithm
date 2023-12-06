package Queue_and_Deque;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {
		Queue<Integer>numbers=new PriorityQueue<>();
		numbers.offer(5);
		numbers.offer(1);
		numbers.offer(2);
//Priority queue using iterator
		/*System.out.print("Priority queue using iterator():");
		Iterator<Integer>iterate=numbers.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(",");
		}*/
		
		System.out.println("Queue: "+numbers);
		int accessednumber=numbers.peek();
		System.out.println("AccessedNumber: "+accessednumber);
		int removenumber=numbers.poll();
		System.out.println("RemovedNumber: "+removenumber);
		System.out.println("Updated Queue: "+numbers);
	}

}
