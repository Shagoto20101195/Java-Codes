import java.util.*;
import java.io.*;
public class NodeClassDefault
{
  static Node hd = null;
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    Node n1 = new Node(8, null);
    Node n2 = new Node(6, n1);
    Node n3 = new Node(4, n2);
    Node n4 = new Node(2, n3);
    Node n5 = new Node(7, n4);
    Node n6 = new Node(5, n5);
    Node n7 = new Node(3, n6);
    Node n8 = new Node(1, n7);
    hd = n8;
    
    System.out.println("Before: ");
    for(Node i = hd; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
    
    rotate(hd, "right", 4);
    System.out.println("After: ");
    for(Node i = hd; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  
  public static void rotate(Node head, String dir, int k)
  {
    if(dir.charAt(0) == 'l')
    {
      for(int i = 0; i<k; i++)
      {
        Node n = head;
        while(n.next != null)
        {
          n = n.next;
        }
        
        Node newtail = new Node(head.element, null);
        n.next = newtail;
        head = head.next;
      }
      hd = head;
    }
    
    else
    {
      for(int i = 0; i<k; i++)
      {
        Node n = head;
        int copy = 0;
        while(n != null)
        {
          if(n == head)
          {
            copy = n.element;
          }
          else
          {
            int temp = n.element;
            n.element = copy;
            copy = temp;
          }
          n = n.next;
        }
        head.element = copy;
      }
    }
  }
}

class Node
{
  int element;
  Node next;
  
  public Node(int e, Node n)
  {
    element = e;
    next = n;
  }
}