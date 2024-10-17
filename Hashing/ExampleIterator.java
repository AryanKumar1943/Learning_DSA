import java.util.*;
public class ExampleIterator 
{
    public static void main(String[]args)
    {
        HashSet<String> cities=new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("chennai");
        cities.add("Noida");
        //Itertator
        // Iterator it=cities.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }
        for(String city:cities)
        {
            System.out.println(city);
        }
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("hello");
        System.out.println(lhs);
        lhs.remove("Delhi");
        System.out.println(lhs);
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Chennai");
        ts.add("Mumbai");
        ts.add("Agra");
        System.out.println(ts);


    }
    
}
