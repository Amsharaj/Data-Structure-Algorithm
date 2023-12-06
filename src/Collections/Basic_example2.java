package Collections;

import java.util.ArrayList;

public class Basic_example2 {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Luck");
		alist.add("Pat");
		alist.add("Angel");
		alist.add("Tom");
		System.out.println(alist);
		System.out.println("Number of elements in Arraylist: "+alist.size());

		alist.remove("Steve");
		alist.remove("Angel");
		System.out.println(alist);
		System.out.println("Number of elements in Arraylist: "+alist.size());
		alist.remove(2);
		System.out.println(alist);
		for(String str:alist)
			System.out.println(str);
		
		System.out.println("Number of elements in Arraylist: "+alist.size());
		}
}
