// Task 8
public class Task8
{
  public static void main(String [] args)
  {
    int [] arr = {1,2,3,4};
    Node head = new Node(null, null, null);
    Node tail = head;
    for(int i = 0; i<arr.length; i++)
    {
      Node newNode = new Node(arr[i], null, null);
      tail.next = newNode;
      newNode.prev = tail;
      tail = tail.next;
    }
    
    tail.next = head;
    head.prev = tail;
    
    System.out.println("Before");
    for(Node i = head.next; i!=head; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
    
    insertBefore(head, 3, 50);
    System.out.println("After");
    for(Node i = head.next; i!=head; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  
  public static void insertBefore(Node head, Object elem, Object newElement)
  {
    for(Node i = head.next; i!=head; i = i.next)
    {
      if(i.element == elem)
      {
        Node newNode = new Node(newElement, null, null);
        Node prevNode = i.prev;
        newNode.next = i;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        i.prev = newNode;
        return;
      }
    }
  }
}

class Node
{
  Object element;
  Node prev;
  Node next;
  
  public Node(Object e, Node p, Node n)
  {
    element = e;
    prev = p;
    next = n;
  }
}