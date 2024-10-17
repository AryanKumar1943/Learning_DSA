public class MaxSubarraySum 
{
    public static int maxSubarraySum(int[] arr)
    {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        { int start=i;
            for(int j=i;j<n;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                currsum=currsum+arr[k];
                }
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
