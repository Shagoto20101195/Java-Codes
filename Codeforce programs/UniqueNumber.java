// May The Father of Understanding Guide Us
import java.util.*;
public class UniqueNumber
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int sum = read.nextInt();
      int ans = 123456789;
      boolean check = false;
      for(int mask = 1; mask<= (1<<10)-1; mask++)
      {
        String s = "";
        for(int i = 0; i<10; i++)
        {
          if((mask & (1<<i)) != 0)
          {
            s += i;
          }
        }
        
        int n = Integer.parseInt(s);
        int total = 0;
        for(int i = 0; i<s.length(); i++)
        {
          total += Integer.parseInt(""+s.charAt(i));
        }
        
        if(total == sum)
        {
          check = true;
          ans = Math.min(ans, n);
        }
      }
      
      if(check)
      {
        System.out.println(ans);
      }
      else
      {
        System.out.println(-1);
      }
    }
  }
}