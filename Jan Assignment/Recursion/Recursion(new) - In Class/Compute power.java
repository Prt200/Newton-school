static int Power(int n,int p)
{
      // Your code her
      if(p == 0){
            return 1;
      }
      return n*Power(n,p-1);
}
