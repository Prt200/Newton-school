 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int a[][] = new int[M][N];
		for(int i = 0;i<M;i++){
			for(int j = 0;j<N;j++){
				a[i][j] = sc.nextInt();
			}
		}
		int maxSum = 0;
		for(int i = 0;i<N;i++){
			int sum = 0;
			for(int j = 0;j<M;j++){
				sum += a[j][i];
			}
			if(maxSum<sum)maxSum=sum;
		}
		System.out.println(maxSum);
	}
}
