//Written by Shagoto
import java.util.*;
public class DrazilAndDate
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long a = read.nextLong();
    long b = read.nextLong();
    long s = read.nextLong();
    
    if((long)Math.abs(a) + (long)Math.abs(b) > s)
    {
      System.out.println("No");
    }
    else if((s - (long)Math.abs(a) + (long)Math.abs(b)) % 2 == 0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}