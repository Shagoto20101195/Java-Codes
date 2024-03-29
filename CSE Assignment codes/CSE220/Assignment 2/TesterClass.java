// Lab Assignment 2
// Andalib Rahman Shagoto
// 20101195
// Section - 11
import java.util.*;
public class TesterClass
{
  public static void main(String [] args)
  {
    int [] arr = {1,2,3,4,5};
    
    // Task 2: Basic Operations
    // 1a
    MyList m1 = new MyList();
    
    // 1b
    MyList m2 = new MyList(arr);
    
    // 1c
    MyList m3 = new MyList(m2);
    
    // 2
    System.out.println("Task 2 - Part 2:");
    m3.showList();
    m1.showList();
    
    // 3
    System.out.println("Task 2 - Part 3:");
    System.out.println(m1.isEmpty());
    System.out.println(m2.isEmpty());
    
    // 4
    System.out.println("Task 2 - Part 4:");
    m3.clear();
    m3.showList();
    
    // 5
    System.out.println("Task 2 - Part 5:");
    Node temp = new Node(1, null);
    m2.insert(temp);
    temp = new Node(6, null);
    m2.insert(temp);
    m2.showList();
    
    // 6
    System.out.println("Task 2 - Part 6:");
    m2 = new MyList(arr);
    m2.insert(7, 10);
    m2.insert(1, 3);
    m2.insert(6, 4);
    m2.showList();
    
    // 7
    System.out.println("Task 2 - Part 7:");
    m2 = new MyList(arr);
    Node removed = m2.remove(3);
    m2.showList();
    
    // Task 3: Advanced Operations
    int [] ex1 = {1,2,5,3,8};
    int [] ex2 = {101,120,25,91,87,1};
    // 1
    System.out.println("Task 3 - Part 1:");
    
    m2 = new MyList(ex1);
    Node evenList = m2.even();
    for(Node i = evenList; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
    
    m2 = new MyList(ex2);
    evenList = m2.even();
    for(Node i = evenList; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
    
    // 2
    System.out.println("Task 3 - Part 2:");
    m2 = new MyList(ex1);
    System.out.println(m2.check(7));
    m2 = new MyList(ex2);
    System.out.println(m2.check(87));
    
    // 3
    System.out.println("Task 3 - Part 3:");
    m2 = new MyList(ex1);
    m2.reverse();
    m2.showList();
    
    // 4
    System.out.println("Task 3 - Part 4:");
    m2 = new MyList(ex1);
    m2.sort();
    m2.showList();
    
    // 5
    System.out.println("Task 3 - Part 5:");
    m2 = new MyList(ex1);
    m2.sum();
    
    // 6
    int [] ex3 = {3,2,5,1,8};
    System.out.println("Task 3 - Part 6:");
    m2 = new MyList(ex3);
    m2.rotate("left", 2);
    m2.showList();
    
    m2 = new MyList(ex3);
    m2.rotate("right", 2);
    m2.showList();
  }
}

// ------------------ MyList Class & Methods ------------------

class MyList
{
  // Task 2
  Node n;
  
  // 1a
  public MyList()
  {
    n = null;
  }
  
  // 1b
  public MyList(int [] arr)
  {
    Node head = null;
    Node tail = null;
    
    for(int i = 0; i<arr.length; i++)
    {
      Node newNode = new Node(arr[i], null);
      if(head == null)
      {
        head = newNode;
        tail = head;
      }
      else
      {
        tail.next = newNode;
        tail = newNode;
      }
    }
    n = head;
  }
  
  // 1c
  public MyList(MyList a)
  {
    Node head = null;
    Node tail = null;
    
    for(Node i = a.n; i!=null; i = i.next)
    {
      Node newNode = new Node(i.element, null);
      if(head == null)
      {
        head = newNode;
        tail = head;
      }
      else
      {
        tail.next = newNode;
        tail = newNode;
      }
    }
    n = head;
  }
  
  // 2
  public void showList()
  {
    Node head = n;
    
    if(head == null)
    {
      System.out.println("Empty list");
      return;
    }
    
    while(head != null)
    {
      System.out.print(head.element+" ");
      head = head.next;
    }
    System.out.println();
  }
  
  // 3
  public boolean isEmpty()
  {
    if(n == null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  // 4
  public void clear()
  {
    n = null;
  }
  
  // 5
  public void insert(Node newNode)
  {
    Node tail = n;
    while(tail.next != null)
    {
      if(tail.element == newNode.element)
      {
        System.out.println("Element already exists");
        return;
      }
      tail = tail.next;
    }
    tail.next = newNode;
  }
  
  // 6
  public void insert(int newElement, int index)
  {
    Node newNode = new Node(newElement, null);
    int count = 0;
    for(Node i = n; i!=null; i = i.next)
    {
      if(i.element == newElement)
      {
        System.out.println("Element already exists");
        return;
      }
      count++;
    }
    
    if(index < 0 || index > count)
    {
      System.out.println("Invalid index");
      return;
    }
    
    if(index == 0)
    {
      newNode.next = n;
      n = newNode;
    }
    else
    {
      Node before = nodeAt(n, count, index-1);
      newNode.next = before.next;
      before.next = newNode;
    }
  }
  
  // 7
  public Node remove(int deleteKey)
  {
    Node removedNode = null;
    Node prev = null;
    for(Node i = n; i!=null; i = i.next)
    {
      if(i.element == deleteKey && prev == null)
      {
        removedNode = new Node(deleteKey, null);
        n = n.next;
        return removedNode;
      }
      else if(i.element == deleteKey)
      {
        removedNode = new Node(deleteKey, null);
        prev.next = i.next;
        break;
      }
      else
      {
        prev = i;
      }
    }
    
    return removedNode;
  }
  
  // For part 6
  public Node nodeAt(Node head, int size, int index)
  {
    Node temp = head;
    for(int i = 0; i<index; i++)
    {
      temp = temp.next;
    }
    
    return temp;
  }
  
  // Task 3: Advanced Operations
  
  //1
  public Node even()
  {
    Node head = null;
    Node tail = null;
    for(Node i = n; i!=null; i = i.next)
    {
      if(i.element % 2 == 0)
      {
        Node newNode = new Node(i.element, null);
        if(head == null)
        {
          head = newNode;
          tail = newNode;
        }
        else
        {
          tail.next = newNode;
          tail = newNode;
        }
      }
    }
    return head;
  }
  
  // 2
  public boolean check(int elem)
  {
    for(Node i = n; i!=null; i = i.next)
    {
      if(i.element == elem)
      {
        return true;
      }
    }
    return false;
  }
  
  // 3
  public void reverse()
  {
    Node newHead = null;
    while(n != null)
    {
      Node nextNode = n.next;
      n.next = newHead;
      newHead = n;
      n = nextNode;
    }
    n = newHead;
  }
  
  // 4
  public void sort()
  {
    for(Node i = n; i.next!=null; i = i.next)
    {
      int min = i.element;
      Node minNode = i;
      
      for(Node j = i.next; j!=null; j = j.next)
      {
        if(j.element < min)
        {
          min = j.element;
          minNode = j;
        }
      }
      
      int temp = i.element;
      i.element = min;
      minNode.element = temp;
    }
  }
  
  // 5
  public void sum()
  {
    int total = 0;
    for(Node i = n; i!=null; i = i.next)
    {
      total += i.element;
    }
    
    System.out.println(total);
  }
  
  // 6
  public void rotate(String dir, int k)
  {
    // If left rotate
    if(dir.charAt(0) == 'l')
    {
      for(int i = 0; i<k; i++)
      {
        Node temp = n;
        while(temp.next != null)
        {
          temp = temp.next;
        }
        
        Node newtail = new Node(n.element, null);
        temp.next = newtail;
        n = n.next;
      }
    }
    
    // Else right rotate
    else
    {
      for(int i = 0; i<k; i++)
      {
        int copy = 0;
        for(Node j = n; j != null; j = j.next)
        {
          if(j == n)
          {
            copy = j.element;
          }
          else
          {
            int temp = j.element;
            j.element = copy;
            copy = temp;
          }
        }
        
        n.element = copy;
      }
    }
  }
}

// ------------------ Node Class ------------------

// Task 1
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