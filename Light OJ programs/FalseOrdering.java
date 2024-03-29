//Written by Shagoto
import java.util.*;
public class FalseOrdering
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    for(int x = 2; x<=32; x++)
    {
      for(int i = 1000; i>=2; i--)
      {
        int count = 0;
        for(int j = 1; j<=(int)Math.sqrt(i); j++)
        {
          if(i % j == 0 && j*j != i)
          {
            count += 2;
          }
          else if(i % j == 0 && j*j == i)
          {
            count++;
          }
        }
        
        if(count == x)
        {
          a.add(i);
        }
      }
    }
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      
      if(n == 1)
      {
        System.out.println("Case "+x+": 1");
      }
      else
      {
        System.out.println("Case "+x+": "+a.get(n - 2));
      }
    }
  }
}