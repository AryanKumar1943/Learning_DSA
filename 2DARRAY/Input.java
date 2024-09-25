import java.util.*;
public class Input
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the  row size of array");
    int r=sc.nextInt();
    System.out.println("enter the  column size of array");
    int c=sc.nextInt();
    System.out.println("Enter the elements of 2D Array");
    int[][]arr=new int[r][c];
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
     arr[i][j]=sc.nextInt();
     }

    }
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
        System.out.print(arr[i][j]+" ");
     }
     System.out.println();
}
}
}