import java.util.*;
import java.io.*;
public class LLManipulation1
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    Node head = null;
    
    Node n4 = new Node(40, null);
    Node n3 = new Node(30, n4);
    Node n2 = new Node(20, n3);
    Node n1 = new Node(10, n2);
    head = n1;
    
    System.out.println("List before:");
    for(Node i = head; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
    
    
    head = insert(head, 4, 50, 2);
    System.out.println("List after adding:");
    for(Node i = head; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
    
    head = remove(head, 5, 3);
    System.out.println("List after removing:");
    for(Node i = head; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  
  public static Node insert(Node head, int size, Object elem, int index)
  {
    // For invalid index to add an element
    if(index < 0 || index > size)
    {
      throw new IndexOutOfBoundsException();
    }
    
    // Creating a node for new element
    Node newNode = new Node(elem, null);
    if(index == 0)
    {
      // New node will have what head was pointing at
      newNode.next = head;
      // Now the head will point at the new node
      head = newNode;
    }
    else
    {
      // Accessing previous node
      Node before = nodeAt(head, size, index-1);
      // New node will be pointing what the previous node was pointing at
      newNode.next = before.next;
      // The previous node will now point at the new node
      before.next = newNode;
    }
    
    return head;
  }
  
  public static Node remove(Node head, int size, int index)
  {
    // For invalid index to remove
    if(index < 0 || index >= size)
    {
      throw new IndexOutOfBoundsException();
    }
    
    // A blank node to store
    Node remNode = null;
    if(index == 0)
    {
      // If starting index, just point the head to the next node
      head = head.next;
    }
    else
    {
      // Accessing the previous node
      Node before = nodeAt(head, size, index-1);
      // Keeping the pointer of previous node in remNode
      // remNode is now the node which will be removed
      remNode = before.next;
      // Previous node will point address next to removed element
      // remNode.next is the pointer that points next node of the node which is being removed
      before.next = remNode.next;
    }
    
    // Not necessary, but just to remove the garbage values
    remNode.element = null;
    remNode.next = null;
    
    return head;
  }
  
  // Used to get Node information at an index
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