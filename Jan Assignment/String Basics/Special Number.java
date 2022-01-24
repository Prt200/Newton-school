import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					 Scanner sc = new Scanner(System.in);
					 String a = sc.nextLine();
					 int sum = 0;
					 for(int i =0;i<a.length();i++){
						 sum+=a.charAt(i)-'0';
					 }
					 if(sum%3==0){
						 System.out.println("Yes");
					 }else{
						 System.out.println("No");
					 }
	}
}
