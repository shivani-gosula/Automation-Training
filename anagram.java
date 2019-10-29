import java.util.Arrays;

  
public class anagram {
static void Anagram(String S1,String S2 ) {
	
	 boolean IsAnagram = true;
	 if (S1.length() != S2.length()) {  
		 IsAnagram = false;  
     } else {  
         char Array1[] = S1.toCharArray();
         char a1[]=new char[Array1.length];
         char Array2[] = S2.toCharArray(); 
         char a2[]=new char[Array2.length];
         for(int i=0;i<Array1.length;i++) {
        	 int c=0;
        	 for(int j=0;j<Array1.length;j++) {
        		 if(Array1[i]<Array1[j])
        		 {
        			 c++;
        		 }
        	 
         }a1[c]=Array1[i];
     }
         for(int x=0;x<Array2.length;x++) {
        	 int c1=0;
        	 for(int y=0;y<Array2.length;y++) {
        		 if(Array2[x]<Array2[y])
        		 {
        			 c1++;
        		 }
        	 
         }a2[c1]=Array2[x];
     }
         System.out.println(a2);
         System.out.println(a1);
         IsAnagram = Arrays.equals(a1, a2); 
         System.out.println(IsAnagram);
} 
	 if(IsAnagram=true) {
		 System.out.println("Are anagrams");  
     } else {  
         System.out.println("Are not anagrams");  
     }   
	 }
          
       

	public static void main(String[] args) {
		 Anagram("ramyl", "amylr");  
	}

}
