import java.util.*;
public class Maximum 
{
    public static void main(String[] args) {
        {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(5);
            list.add(10);
            list.add(2);
            int max=Integer.MIN_VALUE;
            for(int i=0;i<list.size();i++)
            {
                if(max<list.get(i))
                {
                  max=list.get(i);
                }

            }
            System.out.println("Maximum Value is "+max);
  }
    }
    
}
