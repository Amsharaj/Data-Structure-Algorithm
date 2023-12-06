package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_union {

	public static void main(String[] args) {
		Integer[]Array= {1,2,3,4,5};
		Integer[]Array1= {5,3,6,7,9};
      Set<Integer>set1= new HashSet<Integer>();
        set1.addAll(Arrays.asList(Array));
        Set<Integer>set2= new HashSet<Integer>();
        set2.addAll(Arrays.asList(Array1));
        //Finding union of set1 and set2
        Set<Integer>union_data= new HashSet<Integer>(set1); 
        union_data.addAll(set2);
        System.out.print("Union of set1 and set2: ");
        System.out.println(union_data);
        //Finding intersection of set1 and set2
        Set<Integer>intersection_data= new HashSet<Integer>(set1); 
        intersection_data.retainAll(set2);
        System.out.print("Intersection of set1 and set2: ");
        System.out.println(intersection_data);
        

	}

}
