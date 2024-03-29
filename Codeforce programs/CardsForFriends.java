// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class CardsForFriends
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int w = read.nextInt();
      int h = read.nextInt();
      int n = read.nextInt();
      long count = 1;
      while(w % 2 == 0 || h % 2 == 0)
      {
        if(w % 2 == 0)
        {
          w /= 2;
          count *= 2;
        }
        if(h % 2 == 0)
        {
          h /= 2;
          count *= 2;
        }
      }
      
      if(count >= n || n == 1)
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