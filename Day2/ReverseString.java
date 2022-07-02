


class Reverse
{
    // Complete the function
    // str: input string
    
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int s=0;
        int len=str.length();
        String rev="";
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        return rev;
        
    }
}
