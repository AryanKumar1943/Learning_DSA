

public class prefixsum 
{
    public static int maxSubarraySum(int[] arr)
    {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int n=arr.length;
        int prefix[]=new int[n];
        // calculate prefix array
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++)
        { int start=i;
            for(int j=i;j<n;j++)
            {
                int end=j;

              currsum= start==0 ? prefix[end]:prefix[end]-prefix[start-1];  
                if(currsum>maxsum)
                {
                    maxsum=currsum;

                }
                currsum=0;
            }
        
        }
        return maxsum;

    }

    public static void main(String[] args) 
    {
     int arr[]={1,-2,6,-1,3};
     System.out.println(maxSubarraySum(arr));
        
    }
    
}
