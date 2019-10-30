
public class StringSpaces {
	 public static void putSpaces(String input) 
	    { 
	        char[] array1=input.toCharArray();
	        System.out.print(array1[0]);
	        for (int i=1;i<array1.length;i++) 
	        { 
	            if (array1[i]>='A'&&array1[i]<='Z') 
	            {  
	                System.out.print(" "); 
	                System.out.print(array1[i]); 
	            }
	            else 
	            {
	            System.out.print(array1[i]); 
	            }
	        }
	    }
	    
	public static void main(String[] args) {
		String string ="HarshaVardhanReddyChowdaryYouGaveThisExample:)"; 
		putSpaces(string); 
		
	}

}
