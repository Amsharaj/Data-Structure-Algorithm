package Collections;

import java.util.ArrayList;

public class Integer_example {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList number=new ArrayList();
		number.add(1);
	    number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add("File1");
		number.add("file2");
		System.out.println(number);
		System.out.println("Number of elements in Arraylist: "+number.size());
		
	}

}
