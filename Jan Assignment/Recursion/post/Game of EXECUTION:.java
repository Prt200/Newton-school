import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static int GameOFExe(int n, int k){
		if(n==1){
			return 1;
		}else{
			return (GameOFExe(n-1,k)+k-1)%n+1;
		}
	}
	public static void main (String[] args) {
                      // Your code here
					   int t, n , k;
					   Scanner sc = new Scanner(System.in);
					    t = sc.nextInt();
						for(int i=0;i<t;i++){
					    n = sc.nextInt();
						k = sc.nextInt();

					System.out.println(GameOFExe(n,k));
						}
						
	}
}
