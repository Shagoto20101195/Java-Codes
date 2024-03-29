// Lab Assignment 1
// Andalib Rahman Shagoto
// 20101195
// Section - 11
import java.util.*;
public class Assignment1
{
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    // Linear Array
    // Task 1
    System.out.println("Linear Array");
    System.out.println("Task 1:");
    int [] task1 = {10,20,30,40,50,60};
    shiftLeft(task1, 3);
    for(int i = 0; i<task1.length; i++)
    {
      System.out.print(task1[i]+" ");
    }
    System.out.println();
    
    // Task 2
    System.out.println("Task 2:");
    int [] task2 = {10,20,30,40,50,60};
    rotateLeft(task2, 3);
    for(int i = 0; i<task2.length; i++)
    {
      System.out.print(task2[i]+" ");
    }
    System.out.println();
    
    // Task 3
    System.out.println("Task 3:");
    int [] task3 = {10,20,30,40,50,0,0};
    remove(task3, 5, 2);
    for(int i = 0; i<task3.length; i++)
    {
      System.out.print(task3[i]+" ");
    }
    System.out.println();
    
    // Task 4
    System.out.println("Task 4:");
    int [] task4 = {10,2,30,2,50,2,2,0,0};
    removeAll(task4, 7, 2);
    for(int i = 0; i<task4.length; i++)
    {
      System.out.print(task4[i]+" ");
    }
    System.out.println();
    
    // Task 5
    System.out.println("Task 5:");
    int [] task5a = {1, 1, 1, 2, 1};
    System.out.println(splittingArray(task5a));
    
    int [] task5b = {2, 1, 1, 2, 1};
    System.out.println(splittingArray(task5b));
    
    int [] task5c = {10, 3, 1, 2, 10};
    System.out.println(splittingArray(task5c));
    
    // Task 6
    System.out.println("Task 6:");
    int [] task6a = arraySeries(2);
    for(int i = 0; i<task6a.length; i++)
    {
      System.out.print(task6a[i]+" ");
    }
    System.out.println();
    
    int [] task6b = arraySeries(3);
    for(int i = 0; i<task6b.length; i++)
    {
      System.out.print(task6b[i]+" ");
    }
    System.out.println();
    
    int [] task6c = arraySeries(4);
    for(int i = 0; i<task6c.length; i++)
    {
      System.out.print(task6c[i]+" ");
    }
    System.out.println();
    
    // Task 7
    System.out.println("Task 7:");
    int [] task7a = {1, 2, 2, 3, 4, 4, 4};
    System.out.println(maxBunch(task7a));
    
    int [] task7b = {1,1,2, 2, 1, 1,1,1};
    System.out.println(maxBunch(task7b));
    
    // Task 8
    System.out.println("Task 8:");
    int [] task8a = {4,5,6,6,4,3,6,4};
    System.out.println(repetition(task8a));
    
    int [] task8b = {3,4,6,3,4,7,4,6,8,6,6};
    System.out.println(repetition(task8b));
    
    // Circular Array
    // Task 1
    System.out.println("Circular Array");
    System.out.println("Task 1:");
    int [] cir1a = {20,10,0,0,0,10,20,30};
    System.out.println(palindrome(cir1a, 5, 5));
    
    int [] cir1b = {10,20,0,0,0,10,20,30};
    System.out.println(palindrome(cir1b, 5, 5));
    
    // Task 2
    System.out.println("Task 2:");
    int [] arr1 = {40,50,0,0,0,10,20,30};
    int [] arr2 = {10,20,5,0,0,0,0,0,5,40,15,25};
    int [] lin = intersection(arr1, 5, 5, arr2, 7, 8);
    for(int i = 0; i<lin.length; i++)
    {
      System.out.print(lin[i]+" ");
    }
  }
  
  // Linear Array
  // Task 1
  public static void shiftLeft(int [] arr, int pos)
  {
    if(pos > arr.length)
    {
      System.out.println("Out of index");
      return;
    }
    
    for(int i = pos; i<arr.length; i++)
    {
      arr[i-pos] = arr[i];
    }
    
    for(int i = arr.length - 1; i>=arr.length - pos; i--)
    {
      arr[i] = 0;
    }
  }
  
  // Task 2
  public static void rotateLeft(int [] arr, int rot)
  {
    for(int i = 0; i<rot; i++)
    {
      int temp = arr[0];
      for(int j = 1; j<arr.length; j++)
      {
        arr[j-1] = arr[j];
      }
      
      arr[arr.length - 1] = temp;
    }
  }
  
  // Task 3
  public static void remove(int [] arr, int size, int ind)
  {
    arr[ind] = 0;
    for(int i = ind + 1; i<=size; i++)
    {
      arr[i-1] = arr[i];
    }
  }
  
  // Task 4
  public static void removeAll(int [] arr, int size, int val)
  {
    for(int i = 0; i<size;)
    {
      if(arr[i] == val)
      {
        arr[i] = 0;
        for(int j = i; j<size; j++)
        {
          arr[j] = arr[j+1];
        }
        size--;
      }
      else
      {
        i++;
      }
    }
  }
  
  // Task 5
  public static boolean splittingArray(int [] arr)
  {
    int sumfromleft = 0;
    int sumfromright = 0;
    boolean check = false;
    
    for(int i = 0; i<arr.length; i++)
    {
      sumfromright += arr[i];
    }
    
    for(int i = 0; sumfromleft < sumfromright; i++)
    {
      sumfromleft += arr[i];
      sumfromright -= arr[i];
      if(sumfromleft == sumfromright)
      {
        check = true;
        break;
      }
    }
    
    return check;
  }
  
  // Task 6
  public static int [] arraySeries(int n)
  {
    int [] arr = new int[n*n];
    for(int i = 0, max = 1; i<n*n; i+=n, max++)
    {
      for(int j = i+n-1, val = 1; j>=i; j--, val++)
      {
        if(val <= max)
        {
          arr[j] = val;
        }
      }
    }
    
    return arr;
  }
  
  // Task 7
  public static int maxBunch(int [] arr)
  {
    int cur_bun = 1;
    int max_bun = 1;
    
    for(int i = 1; i<arr.length; i++)
    {
      if(arr[i] == arr[i-1])
      {
        cur_bun++;
      }
      else
      {
        cur_bun = 1;
      }
      
      if(cur_bun > max_bun)
      {
        max_bun = cur_bun;
      }
    }
    
    return max_bun;
  }
  
  // Task 8
  public static boolean repetition(int [] arr)
  {
    int max_elem = 0;
    for(int i = 0; i<arr.length; i++)
    {
      if(arr[i] > max_elem)
      {
        max_elem = arr[i];
      }
    }
    
    int [] count = new int[max_elem+1];
    for(int i = 0; i<arr.length; i++)
    {
      count[arr[i]]++;
    }
    
    for(int i = 0; i<count.length-1; i++)
    {
      for(int j = i+1; j<count.length; j++)
      {
        if(count[i] == count[j] && count[i] > 1)
        {
          return true;
        }
      }
    }
    
    return false;
  }
  
  
  // Circular Array
  // Task 1
  public static boolean palindrome(int [] cir, int size, int start)
  {
    int end = (start + size - 1) % cir.length;
    for(int i = 0; i<size/2; i++)
    {
      if(cir[start] != cir[end])
      {
        return false;
      }
      
      start++;
      end--;
      if(start == cir.length)
      {
        start = 0;
      }
      if(end == -1)
      {
        end = cir.length - 1;
      }
    }
    
    return true;
  }
  
  // Task 2
  public static int [] intersection(int [] cir1, int size1, int start1, int [] cir2, int size2, int start2)
  {
    int [] arr1without0 = new int[size1];
    int [] arr2without0 = new int[size2];
    
    for(int i = 0; i<size1; i++)
    {
      arr1without0[i] = cir1[start1];
      start1 = (start1 + 1) % cir1.length;
    }
    
    for(int i = 0; i<size2; i++)
    {
      arr2without0[i] = cir2[start2];
      start2 = (start2 + 1) % cir2.length;
    }
    
    if(size1 < size2)
    {
      int count = 0;
      for(int i = 0; i<size1; i++)
      {
        for(int j = 0; j<size2; j++)
        {
          if(arr1without0[i] == arr2without0[j])
          {
            count++;
          }
        }
      }
      
      int [] lin = new int[count];
      count = 0;
      for(int i = 0; i<size1; i++)
      {
        for(int j = 0; j<size2; j++)
        {
          if(arr1without0[i] == arr2without0[j])
          {
            lin[count] = arr1without0[i];
            count++;
          }
        }
      }
      
      return lin;
    }
    else
    {
      int count = 0;
      for(int i = 0; i<size2; i++)
      {
        for(int j = 0; j<size1; j++)
        {
          if(arr2without0[i] == arr1without0[j])
          {
            count++;
          }
        }
      }
      
      int [] lin = new int[count];
      count = 0;
      for(int i = 0; i<size2; i++)
      {
        for(int j = 0; j<size1; j++)
        {
          if(arr2without0[i] == arr1without0[j])
          {
            lin[count] = arr1without0[i];
            count++;
          }
        }
      }
      
      return lin;
    }
  }  
}