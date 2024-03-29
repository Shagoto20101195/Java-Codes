//Written by Shagoto
import java.util.*;
public class MagicalSticks
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long n = read.nextLong();
      long sum = n * (2+(n - 1)) / 2 - n;
      System.out.println(sum / n + 1);
    }
  }
}