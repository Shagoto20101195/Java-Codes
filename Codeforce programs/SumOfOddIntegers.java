//Written by Shagoto
import java.util.*;
public class SumOfOddIntegers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int k = read.nextInt();
      
      if(n % 2 == 0 && k % 2 == 0 && k <= (int)Math.sqrt(n))
      {
        System.out.println("YES");
      }
      else if(n % 2 == 1 && k % 2 == 1 && k <= (int)Math.sqrt(n))
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