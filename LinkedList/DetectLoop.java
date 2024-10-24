public class DetectLoop
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        size++;
        Node newNode = new Node(data);
        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head; // linking
        head = newNode;
    }

    public void addLast(int data)
    {
        size++;
        Node newNode = new Node(data);
        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display()
    {
        if (head == null)
        {
            System.out.println("My linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data)
    {
        if (idx == 0)
        {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Slow-fast approach to find middle of the list
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next; // move slow by 1
            fast = fast.next.next; // move fast by 2
        }
        return slow; // slow is the middle node
    }

    // Check if the linked list is a palindrome
    public boolean checkPalindrome()
    {
        if (head == null || head.next == null)
        {
            return true;
        }

        // Step 1: Find the middle node
        Node midNode = findMid(head);

        // Step 2: Reverse the second half of the list
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare the two halves
        Node right = prev; // Right half head (reversed)
        Node left = head;  // Left half head

        while (right != null)
        {
            if (left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next; // move slow by 1
            fast = fast.next.next; // move fast by 2
            if (slow == fast)
            {
                return true; // cycle exists
            }
        }
        return false;
    }

    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) // Fixing the condition here
        {
            if (head1.data <= head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // If one of the lists has remaining elements
        while (head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head)
    {
        if (head == null || head.next == null) // Fixing the condition here
        {
            return head;
        }

        // Find mid
        Node mid = getMid(head);

        // Left and right halves
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge the sorted halves
        return merge(newLeft, newRight);
    }

    public static void main(String[] args)
    {
        DetectLoop ll = new DetectLoop();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();  // Output: 5->4->3->2->1->null

        ll.head = ll.mergeSort(head);
        ll.display();  // Sorted output
    }
}
