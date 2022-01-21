import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
                      // Your code here

		Scanner sc = new Scanner(System.in);
int array_size = sc.nextInt();
//int N[][] = new int[array_size][array_size];
int k = 0;
int count = 0;
int count2 = 0;
for(int i = 0; i<array_size; i++){
for(int j = 0; j<array_size; j++){
k = sc.nextInt();
//N[i][j] = sc.nextInt();
if ((i + j) % 2 == 0) {
if(k == 0){
count++;
}
} else {
if(k == 1){
count++;
}
}
if((i+j) % 2 == 0){
if(k == 1){
count2++;
}
} else {
if(k == 0){
count2++;
}
}
}
if(i%5 == 0){
System.gc();
}
}
if(count<count2)
System.out.println(count);
else
System.out.println(count2);

sc.close();
}
}
