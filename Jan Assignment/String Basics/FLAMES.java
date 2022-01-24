import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					   Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int a[] = new int[26];
		int b[] = new int[26];
		int sum = 0;
		
		for(int i=0; i<s1.length(); i++){
			a[s1.charAt(i)-'a']++;  
		}
		for(int i=0; i<s2.length(); i++){
			b[s2.charAt(i)-'a']++;
		}

		for(int i=0; i<26; i++){
			sum += Math.abs(a[i]-b[i]);//abs is used to take mod
		}
		/*if(sum%6==1)
		System.out.print("Friends");
		else if(sum%6==2)
		System.out.print("Love");
		else if(sum%6==3)
		System.out.print("Affection");
		else if(sum%6==4)
		System.out.print("Marriage");
		else if(sum%6==5)
		System.out.print("Enemy");
		else if(sum%6==0)
		System.out.print("Siblings");*/

		String st[]= {"Siblings", "Friends", "Love", 
					 "Affection", "Marriage", "Enemy" };
		System.out.print(st[sum%6]);

	}
}
