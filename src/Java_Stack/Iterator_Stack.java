package Java_Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Iterator_Stack {
	static void ReversePrint(Stack<Integer>s){
		if(s.isEmpty())
			return;
		int x=s.peek();
		s.pop();
		System.out.print(x+" ");
		ReversePrint(s);
		s.push(x);
	}

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(24);
		stack.push(5);
		stack.push(11);
		stack.push(36);
		stack.push(65);
		System.out.println("Stack: "+stack);
		stack.pop();
		System.out.println("Stack: "+stack);
		System.out.print("\nNormal Stack: ");
		Iterator<Integer>Iterate=stack.iterator();
		while(Iterate.hasNext()) {
			System.out.print(Iterate.next());
			System.out.print(" ");
		}
		System.out.print("\nStack In Reverse: ");
		ListIterator<Integer>ListIterator=stack.listIterator(stack.size());
    	while(ListIterator.hasPrevious())
    	{
    		Integer avg=ListIterator.previous();
    		System.out.print(avg+" ");
    	}
		//ReversePrint(stack);
		//System.out.println(stack);
		}
	}


