//Written by Shagoto
import java.util.*;
public class GradeAllocation
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t  = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int m = read.nextInt();
      ArrayList<Integer> a = new ArrayList<Integer>();
      int total = 0;
      
      for(int i = 0; i<n; i++)
      {
        a.add(read.nextInt());
        total += a.get(i);
      }
      
      if(a.contains(m) || total == m)
      {
        System.out.println(m);
      }
      else
      {
        int temp1 = a.get(0);
        int temp2 = total - temp1;
        
        while(temp1 < m)
        {
          if(temp2 <= 0)
          {
            break;
          }
          else
          {
            temp1++;
            temp2--;
          }
        }
        
        System.out.println(temp1);
      }
    }
  }
}