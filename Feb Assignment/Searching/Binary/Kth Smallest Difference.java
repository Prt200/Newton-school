import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
                      // Your code here
                      
					
	 InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);
//   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));          
			 int t= Integer.parseInt(br.readLine().trim());
				while(t-->0)
					  {
						String str[] = br.readLine().trim().split(" ");
						int n= Integer.parseInt(str[0]);
						  int k= Integer.parseInt(str[1]);
						  int a[]=new int[n];
						  str = br.readLine().trim().split(" ");

						  for(int i=0; i<n;i++)
						  {
							  a[i]=Integer.parseInt(str[i]);
						  }
						  System.out.println(Math.abs(kthDiff(a, n, k)));
					  }
				
					  
	}
	public static int kthDiff(int a[], int n, int k)
{
Arrays.sort(a);



	int low = a[1] - a[0];
	for (int i = 1; i <= n-2; ++i)
		low = Math.min(low, a[i+1] - a[i]);


	int high = a[n-1] - a[0];


	while (low < high)
	{
		int mid = (low+high)>>1;
		if (countPairs(a, n, mid) < k)
			low = mid + 1;
		else
			high = mid;
	}

	return low;
}
public static int countPairs(int a[], int n, int mid)
{
	int res = 0, value;
        for(int i = 0; i < n; i++)
        {
			if(a[i]+mid>a[n-1])
              res+=(n-(i+1));
            else
            {
             int ub = upperbound(a, n, a[i]+mid);
             res += (ub- (i+1));
            }
        }
        return res;
    }

static int upperbound(int a[], int n, int value)
    {
        int low = 0;
        int high = n;
        while(low < high)
        {
            final int mid = (low + high)/2;
            if(value >= a[mid])
                low = mid + 1;
            else
                high = mid;
        }
  
    return low;
    }
}
