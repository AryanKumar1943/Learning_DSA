public class countingSort
 {

    public static void SortMyArray(int arr[])
    {   int x=0;
        int n=arr.length;
        int count[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            count[num]=count[num]+1;
        }
       for(int i=0;i<n;i++)
    {
        int num2=count[i];
        for(int j=0;j<num2;j++)
        {
          arr[x]=i;
          x++;
        }
        
    
    }


    }
    public static void main(String[] args)
    {
        int arr[]={1,4,1,3,2,4,3,7};
        SortMyArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
