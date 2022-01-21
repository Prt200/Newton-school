static boolean check_Palindrome(String str,int s, int e) 
    { 

//enter your code her
        if (s == e)
            return true;
 
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
//  If there are more than two characters, check if middle substring is also
//      palindrome or not.
        if (s < e + 1)
            return check_Palindrome(str, s + 1, e - 1);
 
        return true;
    }
 
    static boolean isPalindrome(String str)
    {
        int n = str.length();
 
    // An empty string is
    // considered as palindrome
        if (n == 0)
            return true;
 
        return check_Palindrome(str, 0, n - 1);
    }
