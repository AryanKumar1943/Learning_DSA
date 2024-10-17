import java.util.HashSet;

public class CountDistinct 
{
    public static int CountResult(int arr[])
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        return hs.size();

    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 2, 3, 4,4,5};
        int res=CountResult(arr);
        System.out.println(res);


    }
    
}
