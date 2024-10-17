import java.util.HashMap;
import java.util.Set;

public class iterate
{
    public static void main(String[] args) {
     
    
    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("USA",10);
    hm.put("UK",20);
    hm.put("india",30);
    //Iterate
    //hm.entrySet()
    Set<String> keys=hm.keySet();
    System.out.println(keys);
    for (String k : keys) 
    {
        System.out.println("Key="+k+",value="+hm.get(k));
}
    }
    
}
