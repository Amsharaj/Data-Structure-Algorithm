package Queue_and_Deque;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_WorkOut {

	public static void main(String[] args) {
		Queue<Integer>ele=new LinkedList<>();
		ele.add(11);
		ele.offer(5);
		ele.offer(25);
		ele.offer(34);
		ele.offer(96);
		ele.offer(112);
		System.out.println(ele);
		System.out.println("Accessed Element: "+ele.peek());
		System.out.println("Removed Element: "+ele.poll());
		ele.remove(34);
		//boolean remove=ele.remove(34);
		//System.out.println("Removed Element: "+remove);
		System.out.println("Updated Queue: "+ele);
	}

}
