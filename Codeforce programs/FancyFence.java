//Written by Shagoto
import java.util.*;
public class FancyFence
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int a = read.nextInt();
      
      double ans = 0;
      for(int i = 3; ans<a; i++)
      {
        ans = (i-2) * 180 / (double)i;
      }
      
      if(ans == a)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}