import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                       Scanner sc = new Scanner(System.in);
					  int n = sc.nextInt();
					  int[]a = new int[n];
					  for(int i = 0; i<n; i++)
                      {
						  a[i] = sc.nextInt();
					  }
                      int even = 0; 
                      int odd = 1;
                    for (int i = 0; i < n; i++)
                     {
                        if (i % 2 != 0)
                           even += a[i];
                       else
                         odd *= a[i];
                    }
                    System.out.print(even+" "+odd);
                 
	}
}
