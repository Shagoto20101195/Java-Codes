// Task 5
public class Task5
{
  public static void main(String [] args)
  {   
    Node head = null;
    Node n1 = new Node(30, null);
    Node n2 = new Node(55, n1);
    Node n3 = new Node(4, n2);
    Node n4 = new Node(20, n3);
    Node n5 = new Node(7, n4);
    Node n6 = new Node(5, n5);
    Node n7 = new Node(10, n6);
    Node n8 = new Node(15, n7);
    head = n8;
    
    System.out.println("Before:");
    for(Node i = head; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
    
    remove_multiple_of_five(head);
    if(head.element % 5 == 0)
    {
      head = head.next;
    }
    System.out.println("After:");
    for(Node i = head; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  
  public static void remove_multiple_of_five(Node head)
  {
    Node prev = head;
    for(Node i = head.next; i!=null; i = i.next)
    {
      if(i.element % 5 == 0)
      {
        prev.next = i.next;
      }
      else
      {
        prev = i;
      }
    }
  }
}

class Node
{
  int element;
  Node next;
  
  public Node(int x, Node n)
  {
    element = x;
    next = n;
  }
}