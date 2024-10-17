import java.util.HashMap;
public class Classroom
{
public static void main(String[] args)
 {

HashMap<String,Integer> hm=new HashMap<>();
 hm.put("India",100);
 hm.put("China",150);
 hm.put("USA",200);
 System.out.println(hm);

 // Get -O(1)
//  int population =hm.get("India");
//  System.out.println(population);
//  System.out.println(hm.get("Indonesia"));
//  System.out.println(hm.containsKey("India"));
//  System.out.println(hm.containsKey("Indonesia"));
//Remove
System.out.println(hm.remove("China")); // If key:indonesia then null will be printed 
System.out.println(hm); // hm will print same 
//size
System.out.println(hm.size());
// IS EMPTY
hm.clear(); 
System.out.println(hm.isEmpty());

    
}
}