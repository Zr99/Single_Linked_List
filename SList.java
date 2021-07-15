package assignment1;

public class SList {
		
		SNode head;
		
		
		//Add into the list
		public  void add(String x) {
			
			//Create a temporary SNode
			SNode temp = new SNode(x);
			//Add the X into the SNode
	        temp.key = new String(x);
	        //Set the SNode to the next SNode
	        temp.next = head;
	        head = temp;
	        
		}
		
		// Check if the current value has the same value in the list  
		public boolean has(String s) {
			SNode curr = head;
			
			while(curr != null) {
				//if the current value is equal return true
				if(curr.key.equals(s)) {
					return true;
				}
				else {
					//Go to the next SNode
					curr = curr.next;
				}
			}
			return false;
		}
		
		//Count the total number of the list
		public int length() {
			SNode curr = head;
			int count = 0;
			
			while(curr != null) {
				//If current is not empty the counter + 1
				count++;
				//Set the pointer to the next node
				curr = curr.next;
			}
			return count;
		}
		
		
		
		//Remove the item in the list
		//If the value is not exist do nothing
		public void remove(String k) {
			//If the Node is empty do nothing
			if(head == null) return;
			//If the head contain the string just set the pointer to the next node
			if(head.key == k) {
				head = head.next;
				return;
			}
			
			SNode curr = head;
			
			
			while(curr.next != null) {
				if(curr.next.key == k) {
					
					curr.next = head.next;
				}
				else {
					curr = curr.next;
				}
			}
		}
		
		//Check if the list is empty or not
		public boolean isEmpty() {
			
			if(length() == 0) {
				return true;
			}
			return false;
			
		}
		
		//Print out the values in the list
		 public void dump(){
			 
			    SNode curr = head;
			    
			    while (curr != null){
			      System.out.println(curr.key);
			      curr = curr.next;
			    }
			    return;
			  }
		 
		class SNode{
			
			//Declare the variable for float and variable to hold the link of another SNode
			private String key = "";
			private SNode next;
			
			//Constructor of FNode
			public SNode(String v){
			  key = v;
			  next = null;
			}
			
			public String getKey() {
				return key;
			}
			
			public SNode getNode() {
				return next;
			}

			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			SList k = new SList();
			k.add("Hello");
			
			System.out.println(k.head.getKey());
			
			}
	}
	
	
	
	


