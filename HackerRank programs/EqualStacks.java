//Written by Shagoto
import java.util.*;
public class EqualStacks
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    Stack<Integer> s3 = new Stack<Integer>();
    
    int a = read.nextInt();
    int b = read.nextInt();
    int c = read.nextInt();
    
    int [] arr1 = new int[a];
    int sum1 = 0;
    int [] arr2 = new int[b];
    int sum2 = 0;
    int [] arr3 = new int[c];
    int sum3 = 0;
    
    for(int i = 0; i<a; i++)
    {
      arr1[i] = read.nextInt();
      sum1 += arr1[i];
    }
    for(int i = a-1; i>-1; i--)
    {
      s1.push(arr1[i]);
    }
    
    for(int i = 0; i<b; i++)
    {
      arr2[i] = read.nextInt();
      sum2 += arr2[i];
    }
    for(int i = b-1; i>-1; i--)
    {
      s2.push(arr2[i]);
    }
    
    for(int i = 0; i<c; i++)
    {
      arr3[i] = read.nextInt();
      sum3 += arr3[i];
    }
    for(int i = c-1; i>-1; i--)
    {
      s3.push(arr3[i]);
    }
    
    while(!(sum1 == sum2 && sum2 == sum3 && sum1 == sum3))
    {
      int max = Math.max(sum1, Math.max(sum2, sum3));
      
      if(max == sum1)
      {
        sum1 -= s1.pop();
      }
      else if(max == sum2)
      {
        sum2 -= s2.pop();
      }
      else if(max == sum3)
      {
        sum3 -= s3.pop();
      }
    }
    
    System.out.println(sum1);
  }
}