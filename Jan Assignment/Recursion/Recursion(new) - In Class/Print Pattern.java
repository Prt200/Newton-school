static void printPattern(int n,int curr, boolean flag)
{
//Enter your code here
System.out.print(curr+" ");
if(flag==false && curr==n){
    return ;
}
if(curr<=0){flag=false;}
if(flag)//if(flag !=0) flag =true
{
    printPattern(n,curr-5,flag);
}
else
{
    printPattern(n,curr+5,flag);
}
}
