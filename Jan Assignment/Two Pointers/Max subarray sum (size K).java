import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
					  int n = sc.nextInt();
					  int k = sc.nextInt();
					  int a[] = new int[n];
					  for(int i=0;i<n;i++)
					  {
						  a[i] = sc.nextInt();
					  }
					   int maxSum = 0, subarraySum;
        for (int i = 0; i <= a.length-k; i++) {
            subarraySum = 0;
            for (int j = i; j < i+k; j++) {
                subarraySum += a[j];
            }
            maxSum = Math.max(maxSum, subarraySum);
        }

        System.out.println(maxSum);
    }
	
}
