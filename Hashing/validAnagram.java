import java.util.*;
public class validAnagram 
{
    public static boolean  isAnagram(String s1,String s2)
    {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(s1.length()!=s2.length())
        {
            return false;
        }
        for(int i=0;i<s1.length();i++)
        {
          
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i), 0)+1);
        }
        for(int i=0;i<s2.length();i++)
        {
          
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i), 0)+1);
        }
        for(int i=0;i<s1.length();i++)
        {
            if(map1.get(s1.charAt(i))!=map2.get(s1.charAt(i)))
            {return false;
            }
        }
        return true;
 }
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
   
    System.out.println("enter strings to check Anagrams str1 , str2");
    String str1=sc.next();
    String str2=sc.next();
    if(isAnagram(str1,str2))
    {
        System.out.println("Anagram");
    }
    else
    {
        System.out.println("Not Anagram");
    }

}
    
}
