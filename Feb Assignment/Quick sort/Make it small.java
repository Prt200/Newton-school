import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      int n;
                      Scanner sc = new Scanner(System.in);
                      n = sc.nextInt();
                      int a[] = new int[n];
                      for(int i=0;i<n;i++){
                          a[i] = sc.nextInt();
                      }
                      Arrays.sort(a);
                      int flag = 0;
                      for(int i =1;i<n;i++){
                          if(a[i]-a[i-1]!= 1){
                              System.out.println("NO");
                              flag=1;
                              break;}
                          }
                          if(flag==0)
                          System.out.println("YES");
                      
	}
}
