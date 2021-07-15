import java.io.BufferedReader;
import java.io.FileReader;

public class TestRead {
	public static void main(String [] args){
		SList list = new SList();
	    if(args.length != 1){
	      System.err.println("No Filename");
	      return;
	    }
		
	    try{
	    	  BufferedReader br = new BufferedReader(new FileReader(args[0]));
	          String s=br.readLine();
	          while(br.ready()){      	  
	        	  String [] tokens = s.split("[^a-zA-Z]+");
	        	  
	        	  while(s!=null){
	        			for(int i=0;i<tokens.length;i++) {
	        				if(list.has(tokens[i])) {
	        					 System.out.println("This"+tokens[i]+" is in the list!");
	        				}
	        				else {
	      	        		  list.add(tokens[i]);
	      	        	  }
	        			}
	        	  }
	        	  
	        	 System.out.println(list.length());
	          }
	    }catch(Exception e){
	    	System.err.println("Exception: " + e);
	    }
	  }
}
