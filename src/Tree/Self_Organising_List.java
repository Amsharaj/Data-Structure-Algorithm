package Tree;

import java.util.Scanner;

class SelfOrganisingList{
	private int[] list;
	private int[] count;
	private int size;
	public SelfOrganisingList(int listsize) {
		list = new int[listsize];
		count = new int[listsize];
		size=0;
}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==list.length;
	}
	public int getsize() {
		return size;
	}
	public void insert(int val) {
		if(isFull()) {
			System.out.println("Error: List is Full");
			return;
		}
		list[size]=val; //list[0]=7
		count[size]=0;  //count[0]=0
		size++;
	}
	public void remove(int pos) {  
		pos--;
		//pos<0 || pos>=size
		if(pos<0 || pos>=size) {
			System.out.println("Invalid Position");
			return;
		}
		for (int i=pos;i<size-1;i++) {   //i<5-1
			list[i]=list[i+1];           //list[0]=list[1]
			count[i]=count[i+1];         //count[0]=count[1]
		}
		size--;
	}
	public boolean search(int x) {
		boolean searchresult=false;
		int pos=-1;
		for(int i=0;i<size;i++) {
			if(list[i]==x) {
				searchresult=true;
				pos=i;
				break;
				
			}
		}
		if(searchresult) {
			count[pos]++;
			int c= count[pos];
			for(int i=0;i<pos;i++) {
				if(count[pos]>count[i]) {
					for(int j=pos;j>i;j--) {
						list[j]=list[j-1];
						count[j]=count[j-1];
					}
				list[i]=x;
				count[i]=c;
				break;
				}
			}
		}
		return searchresult;
	}
	public void printlist() {
		 System.out.print("\nList = ");
	        for (int i = 0; i < size; i++)
	            System.out.print(list[i] +" ");
	        System.out.print("\nCount = ");
	        for (int i = 0; i < size; i++)
	            System.out.print(count[i] +" ");
	}
}
public class Self_Organising_List {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("SelfOrganizingList Test\n"); 
	 
	        System.out.println("Enter size of list ");
	        SelfOrganisingList list = new SelfOrganisingList(scan.nextInt() ); 
	 
	        char ch;
	        do    
	        {
	            System.out.println("\nSelfOrganizingList Operations\n");
	            System.out.println("1. insert ");
	            System.out.println("2. delete at position");
	            System.out.println("3. search");
	            System.out.println("4. check empty");
	            System.out.println("5. check full"); 
	            System.out.println("6. get size");            
	            int choice = scan.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                list.insert( scan.nextInt() );                     
	                break;                          
	            case 2 : 
	                System.out.println("Enter position to delete");
	                list.remove(scan.nextInt() );                     
	                break;                         
	            case 3 : 
	                System.out.println("Enter integer element to search");
	                System.out.println("Search Result : "+ list.search(scan.nextInt() ));
	                break;                                          
	            case 4 : 
	                System.out.println("Empty status = "+ list.isEmpty());
	                break;     
	            case 5 : 
	                System.out.println("Full status = "+ list.isFull());
	                break;                     
	            case 6 :  
	                System.out.println("Size = "+ list.getsize() +" \n");
	                break;                         
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;    
	            }  
	            list.printlist();
	 
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y');      

	}

}
