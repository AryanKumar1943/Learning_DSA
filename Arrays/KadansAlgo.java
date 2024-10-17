
import java.util.Arrays;

public class KadansAlgo 
{

public static void maxsumSubarray(int arr[])
{
    int ms=Integer.MIN_VALUE;
    int cs=0;
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>0)
        {
            count++;
        }
    }
    if(count==0)
    {
         Arrays.sort(arr);
         System.out.println(arr[arr.length-1]);
        System.exit(0);

    }
    for(int i=0;i<arr.length;i++)
    {
        cs=cs+arr[i];
        if(cs<0)
        {
            cs=0;
        }
        ms=Math.max(cs,ms);
    }
    System.out.println("our max subarray is : "+ms);


}
  public static void main(String[] args)
     {
     int arr[]={-2,-3,-4,-1,-5};
     maxsumSubarray(arr);
        
    }
    
}
