public class Palindrome 
{
    public static boolean CheckPalindrome(String s)
    {
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)!=s.charAt(len-1-i))
            {
                return false;
            }
        }
        return true;


    }
     public static void main(String[] args) {
        boolean res=CheckPalindrome("maaadam");
        System.out.println(res);
    }
}
