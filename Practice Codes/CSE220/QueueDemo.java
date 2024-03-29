public class QueueDemo
{
  public static void main(String [] args)
  {
    ArrayQueue aq = new ArrayQueue(2);
    aq.enqueue(5);
    aq.enqueue(10);
    aq.enqueue(2);
    aq.enqueue(4);
    
    System.out.println("Before:");
    for(int i = 0; i<aq.arr.length; i++)
    {
      System.out.print(aq.arr[i]+" ");
    }
    System.out.println();
    
    System.out.println("First one out: "+aq.dequeue());
    
    System.out.println("After:");
    for(int i = 0; i<aq.arr.length; i++)
    {
      System.out.print(aq.arr[i]+" ");
    }
    System.out.println();
    
    System.out.println("Now at peek: "+aq.peek());
  }
}

class ArrayQueue implements Queue
{
  int size;
  int start;
  Object [] arr;
  
  public ArrayQueue(int st)
  {
    arr = new Object[5];
    start = st;
    size = 0;
  }
  
  public void enqueue(Object o)
  {
    if(size == arr.length)
    {
      System.out.println("No more standing space");
      return;
    }
    
    arr[(start+size) % arr.length] = o;
    size++;
  }
  
  public Object dequeue()
  {
    Object temp = arr[start];
    arr[start] = null;
    start = (start + 1) % arr.length;
    return temp;
  }
  
  public Object peek()
  {
    return arr[start];
  }
}

interface Queue
{
  public void enqueue(Object o);
  public Object dequeue();
  public Object peek();
}