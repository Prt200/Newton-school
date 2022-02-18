public static void threeWayPartition(int[] arr, int lowVal, int highVal)
{
	// Your code here
	 int  n = arr.length;
        int start = 0, end = n-1;
        for(int i = 0; i <= end;)
        {
             
          
            if(arr[i] < lowVal)
            {
                 
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
                 
            }
             
            else if(arr[i] > highVal)
            {
                 
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
                  
            }
             
            else
               i++;
        }
         
    }
     
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int n = sc.nextInt();
		int arr[] = new int[n];
		int lowVal = sc.nextInt();
		int highVal = sc.nextInt();
		//  threeWayPartition(arr, lowVal,highVal);
		for(int i=0;i<arr.length;i++){
			 arr[i] = sc.nextInt();
		
            System.out.print(arr[i] + " ");
        }
          
    }
}
