  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args){
                          // Your code here
        Scanner sc = new Scanner(System.in);  
        String s = sc.next();
        int c=0, t=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'F'){
                if(i-c<=t && t!=0) 
                    t++;
                else   
                    t=i-c;
            c++;
            }
        }
        System.out.println(t);
        }
	}
