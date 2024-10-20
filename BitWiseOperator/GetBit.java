public class GetBit
{
    public static int GetIthBit(int n,int i)
    {
        int bitmask=1<<i;
       if((n& bitmask)==0)
       {
       return 0;
       }
      return 1;
    }
    public static int SetIthBit(int n,int i) 
    {
        int bitmask=1<<i;
       
        return n | bitmask;


    }
    public static int ClearIthBit(int n,int i) 
    {
        int bitmask=~(1<<i);
       
        return n & bitmask;
 }
 public static int UpdateIthBit(int n,int i,int newBit)
 {
    // if(newBit==0)
    // {
    //     return ClearIthBit(n, i);
    // }
    // return SetIthBit(n, i);
     n=ClearIthBit(n,i);
     int BitMask=newBit<<i;
 }
  public static void main(String[] args) 
    {
        System.out.println(GetIthBit(15,2));
        System.out.println(SetIthBit(15,2));
        System.out.println(ClearIthBit(10,2));
        System.out.println(UpdateIthBit(10,2,0));
        
       

        
    }
}