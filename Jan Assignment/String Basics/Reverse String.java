import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					   Scanner sc=new Scanner(System.in);
					  String n=sc.next();
					  String rev="";
					  int last = n.length()-1;
					  
					    for(int i=last;i>=0;i--)
				 	    {
							rev += n.charAt(i);
				    	}
				 	   int count=0;
					   for(int j=0;j<rev.length()-1;j++)
					   {
						   if(rev.charAt(j)=='0')
						   {
							   count++;
						   }
						   else break;
					
					   }
					 
					  System.out.println(rev.substring(count));
	}
}
