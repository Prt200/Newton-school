import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	 public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        while(T-->0) {
            int m = in.nextInt();
            int n = in.nextInt();
            in.nextLine();
            for(int i=0;i<m;i++)
                {
                    boolean is_zero = true;
                    String str = in.nextLine();
                    if (str.contains("1")){is_zero=false;}
                    if (is_zero){System.out.print(str);}
                    else {
                        for(int j=0;j<n;j++){System.out.print("1"+ " ");}
                    }
                System.out.println("");
            }
        }
    }
}
