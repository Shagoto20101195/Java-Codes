public class LinkedListExample
{
  public static void main(String [] args)
  {
    Node head = null;
    
    Node n4 = new Node(40, null);
    Node n3 = new Node(30, n4);
    Node n2 = new Node(20, n3);
    Node n1 = new Node(10, n2);
    head = n1;
    
    //  Getting the size of linked list (connected components)
    System.out.println("Size of Linked List: "+countNode(head));
    
    // Getting the value at an index
    System.out.println("Value at 1 is: "+get(head, 1));
    
    // Getting the address from an index to which it is pointing at
    System.out.println("Address in index 2, pointing at 3 is: "+nodeAt(head, 4, 2));
    System.out.println("The address where 3 is at: "+n3);
    
    // Changing value at an index
    System.out.println("Value at 1 before: "+n2.element);
    set(head, 1, 100);
    System.out.println("Value at 1 after: "+n2.element);
    
    // Finding index of an element
    System.out.println("Index of 40: "+indexOf(head, 40));
  }
  
  public static int countNode(Node head)
  {
    int count = 0;
    for(Node n = head; n != null; n = n.next)
    {
      count++;
    }
    return count;
  }
  
  public static Object get(Node head, int index)
  {
    int ind = 0;
    for(Node n = head; n != null; n = n.next, ind++)
    {
      if(ind == index)
      {
        return n.element;
      }
    }
    
    return -1;
  }
  
  public static Node nodeAt(Node head, int size, int index)
  {
    if(index < 0 || index >= size)
    {
      return null;
    }
    
    Node n = head;
    for(int i = 0; i<index; i++, n = n.next)
    {
    }
    
    return n;
  }
  
  public static void set(Node head, int index, int elem)
  {
    Node n = head;
    for(int i = 0; i<index; i++, n = n.next)
    {
    }
    
    n.element = elem;
    return;
  }
  
  public static int indexOf(Node head, Object elem)
  {
    int i = 0;
    for(Node n = head; n != null; n = n.next, i++)
    {
      if(n.element == elem)
      {
        return i;
      }
    }
    
    return -1;
  }
}

class Node
{
  Object element;
  Node next;
  
  public Node(Object e, Node n)
  {
    element = e;
    next = n;
  }
}