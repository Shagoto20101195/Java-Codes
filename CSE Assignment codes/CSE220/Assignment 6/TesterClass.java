// Lab Assignment 6
// Andalib Rahman Shagoto
// 20101195
// Section - 11
import java.util.*;
public class TesterClass
{
  // Task 1
  // Recursive Selection Sort
  static int [] ss(int [] arr, int l)
  {
    if(l == 0)
    {
      return arr;
    }
    
    int max = arr[l];
    int maxIndex = l;
    for(int i = 0; i<l; i++)
    {
      if(arr[i] > max)
      {
        max = arr[i];
        maxIndex = i;
      }
    }
    
    int temp = arr[l];
    arr[l] = max;
    arr[maxIndex] = temp;
    
    return ss(arr, l-1);
  }
  
  // Task 2
  // Recursive Inversion Sort
  static int [] isort(int [] arr, int l)
  {
    if(l == arr.length)
    {
      return arr;
    }
    
    for(int i = l - 1; i>=0; i--)
    {
      if(arr[i] > arr[i+1])
      {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
      }
      else
      {
        break;
      }
    }
    
    return isort(arr, l+1);
  }
  
  // Task 3
  // Bubble Sort for Singly Linked List
  static void bs_singly(SinglyList sl)
  {
    Node head = sl.head;
    for(Node i = head; i != null; i = i.next)
    {
      for(Node j = head; j.next != null; j = j.next)
      {
        if(j.element > j.next.element)
        {
          int temp = j.element;
          j.element = j.next.element;
          j.next.element = temp;
        }
      }
    }
  }
  
  // Task 4
  // Selection Sort for Singly Linked List
  static void ss_singly(SinglyList sl)
  {
    Node head = sl.head;
    for(Node i = head; i.next != null; i = i.next)
    {
      Node minNode = i;
      int minElem = i.element;
      for(Node j = i.next; j != null; j = j.next)
      {
        if(j.element < minElem)
        {
          minElem = j.element;
          minNode = j;
        }
      }
      
      int temp = i.element;
      i.element = minElem;
      minNode.element = temp;
    }
  }
  
  // Task 5
  // Insertion Sort for Doubly Linked List
  static void isort_doubly(DoublyList db)
  {
    Node head = db.head;
    for(Node i = head; i != null; i = i.next)
    {
      for(Node j = i.prev; j != null; j = j.prev)
      {
        if(j.element > j.next.element)
        {
          int temp = j.element;
          j.element = j.next.element;
          j.next.element = temp;
        }
        else
        {
          break;
        }
      }
    }
  }
  
  //Task 6
  // Recursive Binary Search
  static int bs(int [] arr, int l, int r, int source)
  {
    int mid = (l + r) / 2;
    if(l > r || mid >= arr.length)
    {
      return -1;
    }
    else if(arr[mid] == source)
    {
      return mid;
    }
    else if(arr[mid] > source)
    {
      return bs(arr, l, mid-1, source);
    }
    else
    {
      return bs(arr, mid+1, r, source);
    }
  }
  
  // Task 7
  // Recursive n-th Fibonacci with Memoization
  static long [] memo = new long[100];
  static long fibb(int n)
  {
    if(n == 1)
    {
      return 0;
    }
    if(n == 2)
    {
      return 1;
    }
    
    if(memo[n] != 0)
    {
      return memo[n];
    }
    
    memo[n] = fibb(n - 1) + fibb(n - 2);
    return memo[n];
  }
  
  // Method for printing array
  static void printArray(int [] arr)
  {
    for(int i = 0; i<arr.length; i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  // Method for printing singly linked list
  static void printSingly(SinglyList sl)
  {
    for(Node i = sl.head; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  
  // Method for printing doubly linked list
  static void printDoubly(DoublyList db)
  {
    for(Node i = db.head; i!=null; i = i.next)
    {
      System.out.print(i.element+" ");
    }
    System.out.println();
  }
  
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    
    // Task 1
    int [] arr1 = {8, 3, 5, 1, 2, 4, 6, 7};
    System.out.println("-------- Task 1 --------");
    System.out.println("Array before:");
    printArray(arr1);
    System.out.println("Array after recursive selection sort:");
    int [] sorted_task1 = ss(arr1, arr1.length-1);
    printArray(sorted_task1);
    
    
    // Task 2
    int [] arr2 = {8, 3, 5, 1, 2, 4, 6, 7};
    System.out.println("-------- Task 2 --------");
    System.out.println("Array before:");
    printArray(arr2);
    System.out.println("Array after recursive insertion sort:");
    int [] sorted_task2 = isort(arr2, 0);
    printArray(sorted_task2);
    
    
    // Task 3
    int [] arr3 = {8, 3, 5, 1, 2, 4, 6, 7};
    SinglyList task3 = new SinglyList(arr3);
    System.out.println("-------- Task 3 --------");
    System.out.println("Singly Linked List before:");
    printSingly(task3);
    System.out.println("Singly Linked List after bubble sort:");
    bs_singly(task3);
    printSingly(task3);
    
    
    // Task 4
    int [] arr4 = {8, 3, 5, 1, 2, 4, 6, 7};
    SinglyList task4 = new SinglyList(arr4);
    System.out.println("-------- Task 4 --------");
    System.out.println("Singly Linked List before:");
    printSingly(task4);
    System.out.println("Singly Linked List after selection sort:");
    ss_singly(task4);
    printSingly(task4);
    
    
    // Task 5
    int [] arr5 = {8, 3, 5, 1, 2, 4, 6, 7};
    DoublyList task5 = new DoublyList(arr5);
    System.out.println("-------- Task 5 --------");
    System.out.println("Doubly Linked List before:");
    printDoubly(task5);
    System.out.println("Doubly Linked List after insertion sort:");
    isort_doubly(task5);
    printDoubly(task5);
    
    
    // Task 6
    int [] task6 = {2, 4, 6, 8, 10};
    System.out.println("-------- Task 6 --------");
    System.out.println("Given array:");
    printArray(task6);
    System.out.println("Finding index of element by recursive binary search:");
    System.out.println("Enter element:");
    int search = read.nextInt();
    System.out.println("Index of element "+search+" is: "+bs(task6, 0, task6.length, search));
    
    
    // Task 7
    System.out.println("-------- Task 7 --------");
    System.out.println("Finding n-th Fibonacci number by memoization and recursion:");
    System.out.println("Enter number:");
    int n = read.nextInt();
    System.out.println(""+n+"-th Fibonacci number is: "+fibb(n));
  }
}

// ------------- Classes -------------

class SinglyList
{
  Node head;
  
  public SinglyList()
  {
    head = null;
  }
  
  public SinglyList(int [] arr)
  {
    head = null;
    Node tail = null;
    
    for(int i = 0; i<arr.length; i++)
    {
      Node newNode = new Node(arr[i], null);
      
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
  
  public SinglyList(SinglyList sl)
  {
    head = null;
    Node tail = null;
    
    for(Node i = sl.head; i!=null; i = i.next)
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
}

class DoublyList
{
  Node head;
  
  public DoublyList()
  {
    head = null;
  }
  
  public DoublyList(int [] arr)
  {
    head = null;
    Node tail = head;
    for(int i = 0; i<arr.length; i++)
    {
      Node newNode = new Node(arr[i], null, null);
      
      if(head == null)
      {
        head = newNode;
        tail = newNode;
      }
      else
      {
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
      }
    }
  }
  
  public DoublyList(DoublyList db)
  {
    head = null;
    Node tail = head;
    for(Node i = db.head; i!=null; i = i.next)
    {
      Node newNode = new Node(i.element, null, null);
      
      if(head == null)
      {
        head = newNode;
        tail = newNode;
      }
      else
      {
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
      }
    }
  }
}

class Node
{
  Node prev;
  Node next;
  int element;
  
  public Node(int e, Node n)
  {
    element = e;
    next = n;
  }
  
  public Node(int e, Node p, Node n)
  {
    element = e;
    prev = p;
    next = n;
  }
}