import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(read.readLine());
			int[] arr = new int[n];
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(str[i]);
            arr = sortedSquares(arr);
            for(int i = 0; i < n; i++)
               System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
    public static int[] sortedSquares(int[] A) {
        int[] nums = new int[A.length];
        int k=A.length-1;
        int i=0, j=A.length-1;
        while(i<=j){
            if(Math.abs(A[i]) <= Math.abs(A[j])){
                nums[k--] = A[j]*A[j];
                j--;
            }
            else{
                nums[k--] = A[i]*A[i];
                i++;
            }    
        }
        return nums;
    }

}
