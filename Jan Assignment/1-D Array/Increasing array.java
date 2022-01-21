import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
		public static void check(int a[],int N)
	{
		int sum = 0;
		boolean count = true;

		for(int i=2;i<a[0];i++)
		{
			if(a[0]%i==0)
			{
				a[0]=i;
			}
		}

		for(int i=0;i<N;i++)
		{
			for(int j=sum+1;j<a[i];j++)	
			{
				if(a[i]%j ==0)
				{
					a[i]=j;
				}
			}
			sum=a[i];
		}

		for(int i=0;i<N-1;i++)
		{
			if(a[i]>=a[i+1])
			{
				count=false;
				break;
			}
		}
		
		if(count == true)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		N=sc.nextInt();
	
		int[] a = new int[N+1];
	
		for(int i=0;i<N;i++)
		{
			a[i] = sc.nextInt();
		}
		check(a,N);

	}
}
