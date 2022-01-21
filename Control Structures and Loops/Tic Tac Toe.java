import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);

        String player1 = sc.next();

        String player2 = sc.next();


 

        if("R".equals(player1) || "R".equals(player2)){

            System.out.println("R");

        }

        else if ("J".equals(player1)){

            System.out.println(player2);

        }else if("J".equals(player2)){

            System.out.println(player1);

        }else{

            System.out.println("D");

        }
}
}
