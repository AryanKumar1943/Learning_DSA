public class FindSet
 {

    public static void FindSubsets(String str,String ans,int i)
    {
        //base case
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("Empty Set");
            }
            System.out.println(ans);
            return;
        }

        //recursion
        //yes choice
        FindSubsets(str, ans+str.charAt(i), i+1);
        //no choice
        FindSubsets(str,ans,i+1);


    }
      public static void main(String[] args) 
    {
        String str="abc";
        FindSubsets(str,"", 0);

        
    }
    
}
