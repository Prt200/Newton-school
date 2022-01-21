import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(n>0 && n<=16)
         {
			 towerOfHanoi(n,'A', 'C', 'B');
         }
         else
         {
             System.out.println("Invalid input");
         }
     }
     
     static void towerOfHanoi(int n,char FromRod, char ToRod, char aux_rod)
        {
            if(n==1)
            {
                System.out.println("1:"+ FromRod + "->" + ToRod);
                return;
            }
            towerOfHanoi(n-1, FromRod, aux_rod, ToRod);
            System.out.println(""+n+":"+ FromRod + "->"+ToRod);
            towerOfHanoi(n-1, aux_rod, ToRod, FromRod);
        }
}
