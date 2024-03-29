//Written by Shagoto
import java.util.*;
public class GoodNumber
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    HashSet<Integer> uni = new HashSet<Integer>();
    HashMap<Integer,Integer> arr = new HashMap<Integer,Integer>();
    
    int n = read.nextInt();
    int k = read.nextInt();
    for(int i = 0; i<n; i++)
    {
      int val = read.nextInt();
      uni.add(val);
      
      if(arr.containsKey(val))
      {
        int temp = arr.get(val) + 1;
        arr.put(val,temp);
      }
      else
      {
        arr.put(val,1);
      }
    }
    
    int count = 0;
    Iterator<Integer> i = uni.iterator();
    while(i.hasNext())
    {
      int num = i.next();
      int num1 = num;
      HashSet<Integer> digit = new HashSet<Integer>();
      
      while(num > 0)
      {
        digit.add(num%10);
        num /= 10;
      }
      
      boolean check = true;
      for(int j = 0; j<=k; j++)
      {
        if(!digit.contains(j))
        {
          check = false;
          break;
        }
      }
      
      if(check)
      {
        count += arr.get(num1);
      }
    }
    
    System.out.println(count);
  }
}