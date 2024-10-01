public class PrintIncreasing
{

    public static void Display(int num)
    {
        if(num==0)
        {
            return;
        }
        Display(num-1);
        System.out.println(num);

    }


    public static void main(String[]args)
    {
        Display(10);

    }
}
