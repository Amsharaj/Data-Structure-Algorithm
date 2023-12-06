package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Demo {

	public static void main(String[] args) {
		int count[]= {34,22,10,60,30,22};//Integer Array - count
		Set<Integer> set=new HashSet<Integer>();
			for (int i=0;i<count.length;i++) {
				set.add(count[i]);
			}
			System.out.println(set);
			TreeSet<Integer> sortedset=new TreeSet<Integer>(set);
			System.out.println("The sorted list is: ");
			System.out.println(sortedset);
			System.out.println("The first elements of the set is: "+sortedset.first());
			System.out.println("The last elements of the set is: "+(Integer)sortedset.last());
		}

}
