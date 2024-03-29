// Lab Assignment 4
// Andalib Rahman Shagoto
// 20101195
// Section - 11
import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    String input = read.nextLine();
    
    // Task 1
    System.out.println("Checking with ArrayStack:");
    bracket_check_with_ArrayStack(input);
    
    System.out.println();
    
    // Task 2
    System.out.println("Checking with ListStack:");
    bracket_check_with_ListStack(input);
  }
  
  public static void bracket_check_with_ArrayStack(String s)
  {
    Object [] openBrac = {'(', '{', '['};
    Object [] closeBrac = {')', '}', ']'};
    
    ArrayStack stack = new ArrayStack();
    ArrayStack index = new ArrayStack();
    for(int i = 0; i<s.length(); i++)
    {
      if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
      {
        stack.push(s.charAt(i));
        index.push(i+1);
      }
      
      else if(stack.size != 0 && (Object)s.charAt(i) == closeBrac[0])
      {
        if(stack.peek() == openBrac[0])
        {
          stack.pop();
          index.pop();
        }
        else
        {
          System.out.println("The expression is NOT correct.");
          System.out.println("Error at character #"+index.peek()+". '"+stack.peek()+"' - not closed.");
          return;
        }
      }
      
      else if(stack.size != 0 && (Object)s.charAt(i) == closeBrac[1])
      {
        if(stack.peek() == openBrac[1])
        {
          stack.pop();
          index.pop();
        }
        else
        {
          System.out.println("The expression is NOT correct.");
          System.out.println("Error at character #"+index.peek()+". '"+stack.peek()+"' - not closed.");
          return;
        }
      }
      
      else if(stack.size != 0 && (Object)s.charAt(i) == closeBrac[2])
      {
        if(stack.peek() == openBrac[2])
        {
          stack.pop();
          index.peek();
        }
        else
        {
          System.out.println("The expression is NOT correct.");
          System.out.println("Error at character #"+index.peek()+". '"+stack.peek()+"' - not closed.");
          return;
        }
      }
      
      else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
      {
        System.out.println("The expression is NOT correct.");
        System.out.println("Error at character #"+(i+1)+". '"+s.charAt(i)+"' - not opened.");
        return;
      }
    }
    
    if(stack.size == 0)
    {
      System.out.println("The expression is correct.");
    }
    else
    {
      System.out.println("The expression is NOT correct.");
      System.out.println("Error at character #"+index.peek()+". '"+stack.peek()+"' - not closed.");
    }
  }
  
  public static void bracket_check_with_ListStack(String s)
  {
    Object [] openBrac = {'(', '{', '['};
    Object [] closeBrac = {')', '}', ']'};
    
    ListStack stack = new ListStack();
    ListStack index = new ListStack();
    for(int i = 0; i<s.length(); i++)
    {
      if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
      {
        stack.push(s.charAt(i));
        index.push(i+1);
      }
      
      else if(stack.head != null && (Object)s.charAt(i) == closeBrac[0])
      {
        if(stack.peek() == openBrac[0])
        {
          stack.pop();
          index.pop();
        }
        else
        {
          System.out.println("The expression is NOT correct");
          System.out.println("Error at character #"+index.peek()+". '"+stack.peek()+"' - not closed.");
          return;
        }
      }
      
      else if(stack.head != null && (Object)s.charAt(i) == closeBrac[1])
      {
        if(stack.peek() == openBrac[1])
        {
          stack.pop();
          index.pop();
        }
        else
        {
          System.out.println("The expression is NOT correct");
          System.out.println("Error at character #"+index.peek()+". '"+stack.peek()+"' - not closed.");
          return;
        }
      }
      
      else if(stack.head != null && (Object)s.charAt(i) == closeBrac[2])
      {
        if(stack.peek() == openBrac[2])
        {
          stack.pop();
          index.pop();
        }
        else
        {
          System.out.println("The expression is NOT correct");
          System.out.println("Error at character #"+index.peek()+". '"+stack.peek()+"' - not closed.");
          return;
        }
      }
      
      else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
      {
        System.out.println("The expression is NOT correct.");
        System.out.println("Error at character #"+(i+1)+". '"+s.charAt(i)+"' - not opened.");
        return;
      }
    }
    
    if(stack.head == null)
    {
      System.out.println("The expression is correct");
    }
    else
    {
      System.out.println("The expression is NOT correct");
      System.out.println("Error at character #"+index.peek()+". '"+stack.peek()+"' - not closed.");
    }
  }
}

// ----------- ArrayStack Class -----------

class ArrayStack implements Stack
{
  Object [] arr;
  int size;
  
  public ArrayStack()
  {
    arr = new Object[100];
    size = 0;
  }
  
  public void push(Object elem)
  {
    if(size == arr.length)
    {
      System.out.println("Stack Overflow!");
      return;
    }
    
    arr[size] = elem;
    size++;
  }
  
  public Object pop()
  {
    if(size == 0)
    {
      System.out.println("Stack Underflow!");
      return null;
    }
    
    Object temp = arr[size-1];
    arr[size-1] = null;
    size--;
    return temp;
  }
  
  public Object peek()
  {
    if(size == 0)
    {
      System.out.println("Stack Underflow!");
      return null;
    }
    return arr[size-1];
  }
}

// ----------- ListStack -----------

class ListStack implements Stack
{
  Node head;
  
  public ListStack()
  {
    head = null;
  }
  
  public void push(Object elem)
  {
    Node newHead = new Node(elem, head);
    head = newHead;
  }
  
  public Object peek()
  {
    if(head == null)
    {
      System.out.println("Stack Underflow!");
      return null;
    }
    return head.element;
  }
  
  public Object pop()
  {
    if(head == null)
    {
      System.out.println("Stack Underflow!");
      return null;
    }
    Node temp = head;
    head = head.next;
    temp.next = null;
    return temp.element;
  }
}

// ----------- Node -----------

class Node
{
  Object element;
  Node next;
  
  public Node(Object o, Node n)
  {
    element = o;
    next = n;
  }
}

// ----------- Stack Interface -----------

interface Stack
{
  public void push(Object e);
  public Object pop();
  public Object peek();
}