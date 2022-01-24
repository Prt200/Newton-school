import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean findR = true;
		boolean findE = true;
		boolean findD = true;
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)=='r' && findR){
				findR = false;
			}
			if(s.charAt(i)=='e' && findE){
				findE = false;
			}
			if(s.charAt(i)=='d' && findD){
				findD = false;
			}
			if(!findR && !findE && !findD){
				System.out.println("Yes");
				break;
			}
		}
		if(findR || findE || findD){
				System.out.println("No");
			}
	}
}
