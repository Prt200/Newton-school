import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void sort(int arr[], int n){
		for (int i = 0; i < n-1; i++){
            /*Find the minimum element in unsorted array*/
            int min_idx = i; //stores the smallest element for the current location
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j; //Update the minimum index
				}
			}
            /*swap operation begin*/
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
			/*swap operation end*/
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
