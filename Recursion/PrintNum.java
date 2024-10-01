public class PrintNum
{
   public static void display(int num)
   {
    if(num==0)
    {
        return;
    }
    System.out.println(num);
    display(num-1);

   }
   
    public static void main(String[]args)
    {
        display(5);
    }

}