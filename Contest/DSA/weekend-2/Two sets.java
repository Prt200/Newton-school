import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
                      // Your code here
                  int n;
                //   InputStreamReader r = new InputStreamReader(System.in);
                //   BufferedReader br = new BufferedReader(r);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
     if(n%4==1 || n%4==2){
            System.out.println(1);
     }  
else{
    System.out.println(0);
  }
    }
	}
