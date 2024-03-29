public class PriorityQueueChangingDequeue
{
  public static void main(String [] args)
  {
    PriorityQueue list = new PriorityQueue();
    
    list.enqueue(5, 3);
    list.enqueue(5, 2);
    list.enqueue(10, 2);
    list.enqueue(3, 3);
    list.enqueue(5, 1);
    list.enqueue(2, 1);
    System.out.println("At Queue:");
    list.showList();
    
    System.out.println("While serving: ");
    while(list.head.next != list.head)
    {
      list.dequeue();
    }
  }
}

class PriorityQueue implements Queue
{
  Node head;
  
  public PriorityQueue()
  {
    head = new Node(null, null, null, null);
    head.next = head;
    head.prev = head;
  }
  
  public void enqueue(Object o, Object k)
  {
    Node newNode = new Node(o, k, null, null);
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
    
    Object minKey = head.next.key;
    Node minNode = head.next;
    for(Node i = head.next.next; i!=head; i = i.next)
    {
      if((Integer)i.key < (Integer)minKey)
      {
        minKey = i.key;
        minNode = i;
      }
    }

    Object elem = minNode.element;
    Node prevNode = minNode.prev;
    Node nextNode = minNode.next;
    nextNode.prev = prevNode;
    prevNode.next = nextNode;
    minNode = null;
    
    System.out.println("Serving: "+elem+" Serial: "+minKey);
    return elem;
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
      System.out.println("Element: "+i.element+" Serial: "+i.key);
    }
  }
}

interface Queue
{
  public void enqueue(Object o, Object k);
  public Object dequeue();
  public Object peek();
}

class Node
{
  Object element;
  Object key;
  Node prev;
  Node next;
  
  public Node(Object o, Object k, Node p, Node n)
  {
    element = o;
    key = k;
    prev = p;
    next = n;
  }
}