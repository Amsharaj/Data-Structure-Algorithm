package Java_Stack;

import java.util.Stack;

public class Reverse_Stack {
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
		Stack<Integer>stk=new Stack<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		System.out.println("Stack Elements in forward: ");
		System.out.println(stk);
		System.out.println("Stack Elements in Reverse: ");
		ReversePrint(stk);
		System.out.println();
		System.out.println(stk);
	}

}
