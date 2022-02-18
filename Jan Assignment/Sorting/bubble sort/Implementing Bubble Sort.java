import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void sort(int arr[], int n){
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	/*printArray() method to print the array of size n*/
    public static void printArray(int arr[], int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
		}
        System.out.println();
    }

	/*main() method*/
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		sort(arr, n);
		printArray(arr, n);
		}
	}
}
