import java.util.*;
import javax.crypto.KEM;

public class HashMapCode
{
    static class HashMap<K,V> //Generic
    {
        private class Node{
            K key;
            V value;
            public Node(K key,V value)
            {
                this.key=key;
                this.value=value;
            }
        }
            private int size; //n total number of node
            private LinkedList<Node> buckets[]; //N=buckets.length
            @SuppressWarnings("Unchecked")
            // we use this line inorder to ignore the waring given by the compiler  this.buckets=new LinkedList[4]; in this line compiler expect us to give the data type of linkedlist in that case code will not run so we use this line to ignore that issue and to run the code
            public HashMap()
            {
                this.size=0;
                this.buckets=new LinkedList[4];
                for(int i=0;i<4;i++)
                {
                    this.buckets[i]=new LinkedList<>();
                }
            }
            private int hashFunction(K key)
            {
                int hc=key.hashCode();
                return Math.abs(hc)%size; // this will be between 0-size-1 (important % concept)
}
                private int SerchInLL(K key,int bi)
                {
                    LinkedList<Node> ll =buckets[bi];
                    int di=0;
                    for(int i=0;i<ll.size();i++)
                    {
                        Node node=ll.get(i);
                        if(node.key==key)
                        {
                            return di;
                        }
                        di++;
                    }
                    return -1;

                }
                public void put(K key,V value)
                {

                    int bi=hashFunction(key); // 0 to size-1
                    int di=SerchInLL(key,bi);// valid when kwy present if not then -1 then we need to create new  node ; 
                }
            }
            public boolean containsKey(KEM key)
            {
                return false;
            }
            public V remote(K key)
            {
                return null;

            }

        }
    }
    
}
