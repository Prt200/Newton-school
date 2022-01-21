static void SumAndMean(int a[],int n){
  //Enter your code here  

         int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        System.out.print(sum);
        System.out.println(" "+sum/n);
     }
