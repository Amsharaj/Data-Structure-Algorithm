package Singly_LinkedList;

public class Exercise {
	class Mark{
		String data;
		Mark next;
		public Mark(String data) {
			this.data=data;
			this.next=null;
		}
			}
	    public Mark head=null;
	    public Mark tail=null;
	    void addMark(String data) {
	    	Mark m=new Mark(data);
	    	if(head==null) {
	    		head=m;
	    		tail=m;
	    	}
	    	else {
	    		tail.next=m;
	    		tail=m;
	    	}
	    	 }
	   
	    public void display() {
	    	Mark current=head;
	    	if(current==null) {
	    		System.out.println("LL is Empty");
	    	}
	    	else
	    		while(current!=null){
	    			System.out.print(current.data+" ");
	    			current=current.next;
	    		
	    	}
	    }

	public static void main(String[] args) {
		Exercise E=new Exercise();
		E.addMark("raj");
		E.addMark("g");
		E.display();

	}

}
