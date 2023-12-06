package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Example {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>(2);
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		System.out.println("Size is: "+vec.size());
		System.out.println("Default capacity increment is: "+vec.capacity());
		
		vec.addElement("Fruit1");
		vec.addElement("Fruit2");
		vec.addElement("Fruit3");
		System.out.println("Size after addition is: "+vec.size());
		System.out.println("Capacity after increment is: "+vec.capacity());
		//System.out.print(vec+" ");
		//Display vector elements
		Enumeration en=vec.elements();
		System.out.println("\nElements are: ");
		while(en.hasMoreElements())
			System.out.print(en.nextElement()+" ");
	}

}
