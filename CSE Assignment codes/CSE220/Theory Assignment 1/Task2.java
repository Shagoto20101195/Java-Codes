// Task 2
import java.util.*;
public class Task2
{
  public static void main(String [] args)
  {
    Random random = new Random();
    
    int n = 7;
    Node head = null;
    Node n1 = new Node("G", null);
    Node n2 = new Node("F", n1);
    Node n3 = new Node("E", n2);
    Node n4 = new Node("D", n3);
    Node n5 = new Node("C", n4);
    Node n6 = new Node("B", n5);
    Node n7 = new Node("A", n6);
    head = n7;
    
    while(n > 1)
    {
      int val = random.nextInt(4);
      
      System.out.println("Current State:");
      for(Node i = head; i!=null; i = i.next)
      {
        System.out.print(i.element+" ");
      }
      System.out.println();
      System.out.println("Value is: "+val);
      if(val == 1)
      {
        int removeIndex = n / 2 - 1;
        int count = 0;
        Node prev = null;
        for(Node i = head; i!=null; i = i.next)
        {
          if(removeIndex == 0)
          {
            head = head.next;
            break;
          }
          else if(count == removeIndex)
          {
            prev.next = i.next;
            break;
          }
          else
          {
            prev = i;
          }
          
          count++;
        }
        
        
        System.out.println("Remaining participants:");
        for(Node i = head; i!=null; i = i.next)
        {
          System.out.print(i.element+" ");
        }
        System.out.println();
        
        n--;
      }
      
      else
      {
        String copy = "";
        for(Node i = head; i != null; i = i.next)
        {
          if(i == head)
          {
            copy = (String)i.element;
          }
          else
          {
            String temp = (String)i.element;
            i.element = copy;
            copy = temp;
          }
        }
        
        head.element = copy;
      }
    }
    
    System.out.println("Winner: "+head.element);
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