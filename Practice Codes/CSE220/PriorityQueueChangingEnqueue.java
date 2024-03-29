public class PriorityQueueChangingEnqueue
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
    list.showList();
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
    sort();
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
  
  public void sort()
  {
    for(Node i = head.next; i.next != head; i = i.next)
    {
      Object minKey = i.key;
      Object elem = i.element;
      Node minNode = i;
      
      for(Node j = i.next; j != head; j = j.next)
      {
        if((Integer)j.key < (Integer)minKey)
        {
          minKey = j.key;
          elem = j.element;
          minNode = j;
        }
      }
      
      Object tempElem = i.element;
      i.element = elem;
      minNode.element = tempElem;
      
      Object tempKey = i.key;
      i.key = minKey;
      minNode.key = tempKey;
    }
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