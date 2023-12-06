package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic_example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("raj");
		list.add("guru");
		list.add("amsharaj");
		list.add("zzz");
		list.set(1, "king");
		Collections.sort(list);
		list.forEach(System.out::println);
		
		list.remove(2);
		
		System.out.println(list.indexOf("zzz"));
		
		System.out.println(list.get(1));
		
		System.out.println(list.size());
		
		System.out.println(list.contains("Hello"));
		
		
		list.clear();
		System.out.println(list);
		
		
		
		//for(String str:list)
		//System.out.println(str);
		

	}

}
