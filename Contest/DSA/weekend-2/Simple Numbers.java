import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      long l,r,k;
                      Scanner sc = new Scanner(System.in);
                      l = sc.nextLong();
                      r = sc.nextLong();
                     k = sc.nextLong();
                     long x = l/k;
                     if(l%k==0)
                     x--;
                     System.out.println(r/k-x);
	}
}
