import java.util.*;
public class DummyDoublyCircularLL
{
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    Node head = new Node(null, null, null);
    
    head.next = head.prev = head;
    for(int i = 0; i<4; i++)
    {
      Node n = new Node(read.nextInt(), null, null);
      n.next = head.next;
      n.prev = head;
      head.next = n;
      head.prev = n;
    }
    
    for(Node i = head.prev; i!=head; i = i.prev)
    {
      System.out.println(i.elem);
    }
  }
}

class Node
{
  Node next;
  Node prev;
  Object elem;
  
  public Node(Object o, Node n, Node p)
  {
    elem = o;
    next = n;
    prev = p;
  }
}