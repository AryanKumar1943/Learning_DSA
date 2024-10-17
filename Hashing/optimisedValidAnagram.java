import java.util.*;

public class optimisedValidAnagram {

    public static boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for(int i=0;i<t.length();i++)
    {
        char ch=t.charAt(i);
        if(map.get(ch)!=null)
        {
            if(map.get(ch)==1)
            {
                map.remove(ch);
            }
            else
            {
                map.put(ch,map.get(ch)-1);
            }
        }
        else{
            return false;
        }
    }
    return map.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings to check Anagrams str1, str2:");
        String str1 = sc.next();
        String str2 = sc.next();
        
        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
