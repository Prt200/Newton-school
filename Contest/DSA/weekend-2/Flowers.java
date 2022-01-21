
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  int n;
					  Scanner sc = new Scanner(System.in);
					  n = sc.nextInt();
					  int ans = 0;
					  int min=Integer.MAX_VALUE;
					  for(int i=0;i<n;i++){
						  int temp;
						  temp = sc.nextInt();
						  ans += (temp%2 !=0) ? temp : temp-1;
						  if(min>temp)
						  min = temp;
					  }
					  if(n%2 != 0)
					  System.out.println(ans);
					  else{
						  if(min%2 != 0)
						   System.out.println(ans-min);
						   else
						    System.out.println(ans - min + 1);
					  }
	}
}
