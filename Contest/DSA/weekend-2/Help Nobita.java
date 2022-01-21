import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int gcd(int x, int y)
	{
		int i=1;
		int gcd=1;
		while(i<=x && i<=y)
		{
			if(x%i==0 && y%i==0)
			{
				if(gcd <i)
				{
					gcd = i;
				}
			}
			i++;
		}
		return gcd;
	}
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		boolean flag = false;
		int p = gcd(x, y);
		if(n%p==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
