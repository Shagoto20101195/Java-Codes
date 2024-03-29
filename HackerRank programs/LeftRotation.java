//Written by Shagoto
import java.util.*;
public class LeftRotation
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int d = read.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    for(int i = 0; i<n; i++)
    {
      arr.add(read.nextInt());
    }
    
    if(d == n)
    {
      for(int i = 0; i<n; i++)
      {
        System.out.print(arr.get(i)+" ");
      }
      System.out.println();
    }
    else
    {
      for(int i = 0; i<d; i++)
      {
        arr.add(arr.get(0));
        arr.remove(0);
      }
      
      for(int i = 0; i<n; i++)
      {
        System.out.print(arr.get(i)+" ");
      }
      System.out.println();
    }
  }
}