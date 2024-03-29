//Written by Shagoto
import java.util.*;
public class GameWithSticks
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    
    int count = 0;
    while(n * m > 0)
    {
      n--;
      m--;
      count++;
    }
    
    if(count % 2 == 1)
    {
      System.out.println("Akshat");
    }
    else
    {
      System.out.println("Malvika");
    }
  }
}