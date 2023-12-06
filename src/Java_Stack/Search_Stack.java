package Java_Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Search_Stack {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Stack<String>stk=new Stack<>();
		stk.push("Mac book");
		stk.push("Hp");
		stk.push("Dell");
		stk.push("Asus");
		stk.push("Lenova");
		System.out.println("Stack: "+stk);
		int location=stk.search("Dell");
		System.out.println("Location of dell: "+location);
		System.out.println("Is the Stack is Empty: "+stk.isEmpty());
		System.out.println("Size of the Stack: "+stk.size());
//Iterator Method: 
        Iterator iterator =stk.iterator();
        while(iterator.hasNext()) {
        	Object values = iterator.next();
        	System.out.println(values);}
// For Each Method:
        	System.out.println("\nFor Each: ");
        	stk.forEach(n -> System.out.println(n));
// Stack in reverse using List Iterator:
        	ListIterator<String>ListIterator=stk.listIterator(stk.size());
        	System.out.println("\nIterator over the stack from top to bottom:");
        	while(ListIterator.hasPrevious())
        	{
        		String avg=ListIterator.previous();
        		System.out.println(avg);
        	}
	}

}
