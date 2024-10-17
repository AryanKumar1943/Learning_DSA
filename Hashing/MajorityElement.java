import java.util.*;
public class MajorityElement
{
public static void main(String[] args) 
{
    int arr[]={1,3,2,5,1,3,1,5,1};
    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<arr.length;i++)
    {
        // if(map.containsKey(arr[i])){
        //     map.put(arr[i],map.get(arr[i])+1);

        // }
        // else{
        //     map.put(arr[i],1);
        // }
        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        //map.getOrDefault(arr[i], 0) if arr[i](key) exists then it will return the value if value doesnt exist then the default value will be provided by us
    }
    // Set<Integer> keySet=map.keySet();
    for(Integer key:map.keySet())
    {
        if(map.get(key)>arr.length/3)
        {
            System.out.println(key);
        }
    }
    
}

}
    

