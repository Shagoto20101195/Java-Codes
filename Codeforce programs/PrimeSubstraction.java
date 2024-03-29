//Written by Shagoto
import java.util.*;
public class PrimeSubstraction
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int i = 1; i<=t; i++)
    {
      long x = read.nextLong();
      long y = read.nextLong();
      
      if(x - y == 1 || x - y == 0)
      {
        System.out.println("NO");
      }
      else
      {
        System.out.println("YES");
      }
    }
  }
}