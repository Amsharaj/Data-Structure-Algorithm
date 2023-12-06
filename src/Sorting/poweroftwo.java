package Sorting;

public class poweroftwo {
	static public boolean ispoweroftwo(int x) {
		return(x != 0)&&((x&(x-1))==0);
	}

	public static void main(String[] args) {
		System.out.println(ispoweroftwo(8));
		
		//binary value to number
		{int number=0b1010;
		System.out.println(number);}

	}

}
