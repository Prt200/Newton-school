import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
                      // Your code here

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());





        while(t-- > 0)

        {



            String str[] = read.readLine().trim().split(" ");

            int N = Integer.parseInt(str[0]);

            //int K = Integer.parseInt(str[1]);





            //`int D = Integer.parseInt(str[1]);



            int arr[][] = new int[N][N];



            for(int i = 0; i < N; i++)

            {

                str = read.readLine().trim().split(" ");

                for(int j = 0; j < N; j++)

                    arr[i][j] = Integer.parseInt(str[j]);



            }



            //int res[] = moveZeroes(arr);

            //print(res);

            System.out.println(movesToChessboard(arr));



        }

    }



    static void print(int list[])

    {

        for(int i = 0; i < list.length; i++)

            System.out.print(list[i] + " ");



    }



    public static int movesToChessboard(int[][] board) {

        if (board == null || board.length == 0 || board[0].length == 0) {

            return -1;

        }

        int N = board.length;

        for (int i = 0; i < N; ++i) {

            for (int j = 0; j < N; ++j) {

                if ((board[0][0] ^ board[i][0] ^ board[0][j] ^ board[i][j]) == 1) {

                    return -1;

                }

            }

        }

        int rowSum = 0;

        int colSum = 0;

        int rowSwap = 0;

        int colSwap = 0;

        for (int i = 0; i < N; ++i) {

            rowSum += board[0][i];

            colSum += board[i][0];

            if (board[i][0] == i % 2) {

                ++rowSwap;

            }

            if (board[0][i] == i % 2) {

                ++colSwap;

            }

        }

        if (N / 2 > rowSum || N / 2 > (N - rowSum) ||

                N / 2 > colSum || N / 2 > (N - colSum)) {

            return -1;

        }

        if (N % 2 == 0) {

            rowSwap = Math.min(rowSwap, N - rowSwap);

            colSwap = Math.min(colSwap, N - colSwap);

        } else {

            if (colSwap % 2 == 1) {

                colSwap = N - colSwap;

            }

            if (rowSwap % 2 == 1) {

                rowSwap = N - rowSwap;

            }

        }

        return (rowSwap + colSwap) / 2;

    }







}
