//Written by Shagoto
import java.util.*;
public class BoardMoves
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long n = read.nextLong();
      if(n == 1)
      {
        System.out.println(0);
      }
      else
      {
        long count = 0;
        for(long i = 1; i<=n/2; i++)
        {
          long temp = 8 * i * i;
          count += temp;
        }
        System.out.println(count);
      }
    }
  }
}