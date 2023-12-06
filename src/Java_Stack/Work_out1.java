package Java_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Work_out1 {
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
		Stack<Integer>sta=new Stack<Integer>();
		 Scanner s = new Scanner(System.in);
        System.out.println("Linked Stack Test\n");          
        char ch;
        do
        {
            System.out.println("\nLinked Stack Operations\n");
            System.out.println("1. push");
            System.out.println("2. pop ");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = s.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push"); 
                sta.push( s.nextInt() );
                //System.out.print("Stack = "); 
                break;                          
            case 2 :
            	int x= sta.pop(); 
                System.out.println("Pop Element: "+x);
                break;                         
            case 3 : 
                System.out.println("Peek Element: "+sta.peek());
                sta.peek();
                break;                                          
            case 4 : 
            	if(sta.isEmpty())
                System.out.println("Stack is Empty");
            	else
            		 System.out.println("Stack is not Empty");
                break;                   
            case 5 : 
                System.out.println("Size = "+ sta.size() +" \n");
                break;  
            
            }
            System.out.print("Stack= "); 
            if(sta.isEmpty())
                System.out.println("Empty");
            	else
            ReversePrint(sta);
            

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch =s.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');   
        s.close();

	}

}
