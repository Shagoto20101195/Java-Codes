// Task 4
public class Task4
{
  public static void main(String [] args)
  {
    Node head = null;
    Node n1 = new Node(10, null);
    Node n2 = new Node(6, n1);
    Node n3 = new Node(10, n2);
    Node n4 = new Node(1, n3);
    Node n5 = new Node(1, n4);
    Node n6 = new Node(10, n5);
    Node n7 = new Node(6, n6);
    Node n8 = new Node(6, n7);
    head = n8;
    printDuplicate(head);
  }
  
  public static void printDuplicate(Node head)
  {
    int max = 0;
    for(Node i = head; i!=null; i = i.next)
    {
      if(i.element > max)
      {
        max = i.element;
      }
    }
    
    int [] count = new int[max+1];
    for(Node i = head; i!=null; i = i.next)
    {
      count[i.element]++;
      if(count[i.element] == 2)
      {
        System.out.println(i.element);
        break;
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