public class PalindromeCheck
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

    public static void main(String[] args)
    {
        PalindromeCheck ll = new PalindromeCheck();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.display();  // 1->2->3->2->1->null

        System.out.println(ll.checkPalindrome()); // Should print true
    }
}
