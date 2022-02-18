import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					    Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       ArrayList<Integer> A=new ArrayList<Integer>();
        for (int i=0;i<n;i++) {
                   A.add(sc.nextInt());
        }
        Collections.sort(A);
		for(int i=0;i<n-1;i+=2){
System.out.print(A.get(i+1)+" ");
System.out.print(A.get(i)+" ");
}
if(n%2!=0){
System.out.print(A.get(n-1)+" ");
}
	}
}
