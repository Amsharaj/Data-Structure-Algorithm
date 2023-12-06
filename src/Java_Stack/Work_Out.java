package Java_Stack;

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedStack {
    private Node top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Error: Underflow Exception");
            return;
        }
        System.out.println("Popped Element = " + top.data);
        top = top.next;
        size--;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: Underflow Exception");
            return -1; // Return a default value for an empty stack
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}

public class Work_Out {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedStack stack = new LinkedStack();
        char choice;

        do {
            System.out.println("Linked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter integer element to push");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int peekValue = stack.peek();
                    System.out.println("Peek Element = " + peekValue);
                    break;
                case 4:
                    boolean isEmpty = stack.isEmpty();
                    System.out.println("Empty status = " + isEmpty);
                    break;
                case 5:
                    int stackSize = stack.size();
                    System.out.println("Size = " + stackSize);
                    break;
                default:
                    System.out.println("Invalid option");
            }

            System.out.println("Stack = " + (stack));

            System.out.println("Do you want to continue (Type y or n)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y');
    }
}