public class ListQueueDemo
{
  public static void main(String [] args)
  {
    ListQueue list = new ListQueue();
    list.showList();
    list.enqueue(10);
    list.showList();
    System.out.println("Current peek is: "+list.peek());
    list.enqueue(20);
    list.enqueue(30);
    list.enqueue(40);
    list.showList();
    System.out.println("Removing the top: "+list.dequeue());
    list.showList();
    list.dequeue();
    System.out.println("Current peek is: "+list.peek());
  }
}

class ListQueue implements Queue
{
  Node head;
  
  public ListQueue()
  {
    head = new Node(null, null, null);
    head.next = head;
    head.prev = head;
  }
  
  public void enqueue(Object o)
  {
    Node newNode = new Node(o, null, null);
    Node tail = head.prev;
    tail.next = newNode;
    newNode.prev = tail;
    newNode.next = head;
    head.prev = newNode;
  }
  
  public Object dequeue()
  {
    if(head.next == head)
    {
      System.out.println("Queue Underflow");
      return null;
    }
    
    Node removedNode = head.next;
    Node nextHead = removedNode.next;
    head.next = nextHead;
    nextHead.prev = head;
    Object element = removedNode.element;
    removedNode = null;
    return element;
  }
  
  public Object peek()
  {
    if(head.next == head)
    {
      System.out.println("Queue Underflow");
      return null;
    }
    
    return head.next.element;
  }
  
  public void showList()
  {
    if(head.next == head)
    {
      System.out.println("Empty queue");
      return;
    }
    
    for(Node i = head.next; i!=head; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
}

interface Queue
{
  public void enqueue(Object o);
  public Object dequeue();
  public Object peek();
}

class Node
{
  Object element;
  Node prev;
  Node next;
  
  public Node(Object o, Node p, Node n)
  {
    element = o;
    prev = p;
    next = n;
  }
}