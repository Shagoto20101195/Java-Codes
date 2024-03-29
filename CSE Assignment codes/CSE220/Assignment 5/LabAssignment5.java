// Lab Assignment 5
// Andalib Rahman Shagoto
// 20101195
// Section - 11
import java.util.*;
public class LabAssignment5
{
  // Task 1
  static int factorial(int n)
  {
    if(n == 0)
    {
      return 1;
    }
    
    return n * factorial(n-1);
  }
  
  // Task 2
  static int fibonacci(int n)
  {
    if(n == 1)
    {
      return 0;
    }
    
    if(n == 2)
    {
      return 1;
    }
    
    return fibonacci(n-1) + fibonacci(n-2);
  }
  
  // Task 3
  static void arrayPrint(int [] arr, int index)
  {
    if(index == arr.length)
    {
      return;
    }
    
    System.out.println(arr[index]);
    arrayPrint(arr, index+1);
    return;
  }
  
  // Task 4
  static String decToBin(int n)
  {
    if(n == 0)
    {
      return "";
    }
    
    return decToBin(n/2) + (n%2);
  }
  
  // Task 5
  static int expo(int m, int n)
  {
    if(n == 1)
    {
      return m;
    }
    
    if(n % 2 == 0)
    {
      return expo(m, n / 2) * expo(m, n / 2);
    }
    else
    {
      return m * expo(m, n / 2) * expo(m, n / 2);
    }
  }
  
  // Task 6
  static int sumList(Node head)
  {
    if(head == null)
    {
      return 0;
    }
    
    return head.element + sumList(head.next);
  }
  
  // Task 7
  static void reverseListPrint(Node head)
  {
    if(head == null)
    {
      return;
    }
    
    reverseListPrint(head.next);
    System.out.println(head.element);
    return;
  }
  
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    int [] arr = {10,20,30,40};
    
    System.out.println("Task 1:");
    int task1 = read.nextInt();
    System.out.println("Factorial: "+factorial(task1));
    
    System.out.println("Task 2: ");
    int task2 = read.nextInt();
    System.out.println("n-th Fibonacci: "+fibonacci(task2));
    
    System.out.println("Task 3: ");
    arrayPrint(arr, 0);
    
    System.out.println("Task 4: ");
    int task4 = read.nextInt();
    System.out.println("To Binary: "+decToBin(task4));
    
    System.out.println("Task 5: ");
    int task5m = read.nextInt();
    int task5n = read.nextInt();
    System.out.println("m^n: "+expo(task5m, task5n));
    
    SinglyNode list = new SinglyNode(arr);
    
    System.out.println("Task 6: ");
    System.out.println(sumList(list.head));
    
    System.out.println("Task 7: ");
    reverseListPrint(list.head);
  }
}


// ------------- SinglyNode Class -------------
class SinglyNode
{
  Node head;
  
  public SinglyNode()
  {
    head = null;
  }
  
  public SinglyNode(int [] arr)
  {
    head = null;
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