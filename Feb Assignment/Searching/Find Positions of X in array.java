import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int array[] = new int[n];

            for (int i = 0; i < n; i++)
                array[i] = sc.nextInt();

            int flag = 0;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++){
                if(array[i] == x) {
                    sb.append(i + " ");
                    flag=1;
                }
            }
            if(flag == 1)
                System.out.println(sb.toString());
            else 
                System.out.println("Not found");
        }
	}
}
