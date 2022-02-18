static void floorAndCeil(int a[], int n, int x){	
//Enter your code here
int it = lower(a,n,x);
if(it==0){
    if(a[it]==x){
        System.out.println(x+" "+x);
    }
    else{
         System.out.println("-1 "+a[it]);
    }
}
else if(it==n){
    it--;
     System.out.println(a[it]+" -1");
}
else{
    if(a[it]==x){
         System.out.println(x+" "+x);
    }
    else{
        it--;
         System.out.println(a[it]+" "+a[it+1]);
    }
}
}


   static int lower(int a[], int n,int k){
       int l =0;
       int h=n-1;
       int m;
       int ans=n;
       while(l<=h){
           m=l+h;
           m/=2;
           if(a[m]<k){
               l=m+1;
           }else{
               h=m-1;
               ans=m;
           }
       }
          return ans;
   }
