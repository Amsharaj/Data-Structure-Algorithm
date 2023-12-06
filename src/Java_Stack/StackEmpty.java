package Java_Stack;

import java.util.Stack;

public class StackEmpty {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<>();
		boolean result =stk.empty();
		System.out.println("Is the Stack empty? "+result);
//pushing element into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
//Prints elements of stack
		System.out.println("Element in Stack: "+stk);
		result=stk.empty();
		System.out.println("Is the Stack empty? "+result);
		
	}
}
