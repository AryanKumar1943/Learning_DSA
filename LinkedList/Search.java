public class Search
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        public void addFirst(int data)
        {     size++;
             //step1 = create new node
            Node newNode=new Node(data);
            if(head==null)
            {
            head=tail=newNode;
            return;
}
            //step2 - newNode next =head
            newNode.next=head; //linking
            //step3 - head =newNode
            head=newNode;
        
        }
        public void addLast(int data)
        {
            size++;
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void display()     // time complexity O(n) 
        {
            if(head==null)
            {
                System.out.print("My linkedlist is empty");
            }
            Node temp=head;
            while (temp!=null) 
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();
            
        }
        public void add(int idx,int data)
        {
            if(idx==0)
            {
                addFirst(data);
                return;
            }
            size++;
            Node newNode=new Node(data);
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            //i=idx-1; temp->prev
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public int removeFirst()
        {
            if(size==0)
            {
                System.out.println("LinkedList is Empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1)
            {
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        public int removeLast()
        {
            if(size==0)
            {
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1)
            {
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            //prev : i=size-2
            Node prev=head;
            for(int i=0;i<size-2;i++)
            {
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
        public  int itrSearchKey(int key) //0(n)
        {
            Node temp=head;
            for(int i=0;i<size;i++)
            {
                if(temp.data==key)
                {
                    return i;
                }
                temp=temp.next;
            }
            return -1;

        }
        public int helper(Node head,int key)
        {
            if(head==null)
            {
                return -1;
            }
            if(head.data==key)
            {
                return 0;
            }
            int idx=helper(head.next,key);
            if(idx==-1)
            {
                return -1;
            }
            return idx+1;
          }
        public  int RecSearchKey(int key) //0(n)
        {
            return helper(head,key);
            
            }
        public static void main(String[] args)
        {
            Search ll=new Search();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(4);
            ll.addLast(5);
            ll.add(2,3);
            ll.display();  // 1->2->3->4->5
            System.out.println(ll.size);
            System.out.println("Position of the key is : "+ (ll.itrSearchKey(1)+1));
            System.out.println(ll.RecSearchKey(3));
            
        }
    }