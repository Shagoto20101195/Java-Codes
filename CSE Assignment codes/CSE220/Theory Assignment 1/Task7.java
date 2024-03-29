// Task 7
public class Task7
{
  public static void main(String [] args)
  {
    int [] arr = {1,2,3,4,5};
    Node head = null;
    Node tail = null;
    for(int i = 0; i<arr.length; i++)
    {
      Node newNode = new Node(arr[i], null);
      if(head == null)
      {
        head = newNode;
        tail = head;
      }
      else
      {
        tail.next = newNode;
        tail = newNode;
      }
    }
    
    tail.next = head;
    System.out.print("Before: "+head.element+" ");
    for(Node i = head.next; i!=head; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
    
    Node newNode = new Node(10, null);
    insert(head, newNode);
    System.out.print("After: "+head.element+" ");
    for(Node i = head.next; i!=head; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  
  public static void insert(Node head, Node newNode)
  {
    Node i = head;
    while(i.next != head)
    {
      i = i.next;
    }
    
    i.next = newNode;
    newNode.next = head;
  }
}

class Node
{
  Object element;
  Node next;
  
  public Node(Object o, Node n)
  {
    element = o;
    next = n;
  }
}