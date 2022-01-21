import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
       Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		int [] ans = new int [n];
		long sum = 0;
		for (int i = 0; i < n - 1; i++){
			if (arr[i + 1] < arr [i]){
				ans[i + 1] = arr[i] - arr[i + 1];
				arr[i + 1] = arr[i];
			}
		}
		for (int i = 0; i < n; i++){
			sum += arr[i];
		}

		for (int e: ans){
			System.out.print(e + " ");
		}
		System.out.println();
		System.out.println(sum);
	} 
}
