import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=sc.nextInt();
			}
		}

		long sumofblack=0; long sumofwhite=0;  
		for( int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((i+j)%2==0){
					sumofblack=sumofblack + arr[i][j];
					
				}
				else{
					sumofwhite=sumofwhite + arr[i][j];
					
				}
			}
		}
		System.out.println(sumofblack);
		System.out.println(sumofwhite);
	}
}
