//Written by Shagoto
import java.util.*;
public class IfAtFirstYouDontSucceed
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int a = read.nextInt();
    int b = read.nextInt();
    int c = read.nextInt();
    int n = read.nextInt();
    
    if(a > n || b > n || c > n || a < c || b < c)
    {
      System.out.println(-1);
    }
    else if(n - (a - c) - (b - c) - c > 0)
    {
      System.out.println(n - (a - c) - (b - c) - c);
    }
    else
    {
      System.out.println(-1);
    }
  }
}