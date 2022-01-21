static int calculator(char ch, int a, int b)
    {
        if(ch == '*')
        {
            return(a*b);
        }
        else if(ch == '/')
        {
            return(a/b);
        }
        else if(ch == '+')
        {
            return(a+b);
        }
        else
        {
            return(a-b);
        }
    }
