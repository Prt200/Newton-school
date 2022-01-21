import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static long solution(int[] a){
        long res = 0;
        for(int i=0;i<32;i++){
            long counton = 0;
            for(int val : a){
                if((val & (1 << i)) != 0){
                    counton++;
                }
            }
               long countoff = a.length - counton;
               long diff = counton * countoff * 2;
               res += diff;
    }
       return res%1000000007;
    }
	public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int[] a = new int[n];
                      for(int i=0;i<a.length;i++){
                          a[i]=sc.nextInt();
                      }
                      System.out.println(solution(a));
	}
}
