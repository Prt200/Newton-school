import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	  static void printDivisors(int n)
    {
        // Vector to store half of the divisors
        Vector<Integer> v = new Vector<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
 
                // check if divisors are equal
                if (n / i == i)
                    System.out.printf("%d ", i);
                else {
                    System.out.printf("%d ", i);
 
                    // push the second divisor in the vector
                    v.add(n / i);
                }
            }
        }
 
        // The vector will be printed in reverse
        for (int i = v.size() - 1; i >= 0; i--)
            System.out.printf("%d ", v.get(i));
    }
 
    // Driver method
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
	  int n= sc.nextInt();
        printDivisors(n);
    }
}
