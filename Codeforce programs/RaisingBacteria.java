//Written by Shagoto
import java.util.*;
public class RaisingBacteria
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int x = read.nextInt();
    int count = 0;
    
    while(x > 0)
    {
      if(x % 2 == 1)
      {
        count++;
        x /= 2;
      }
      else
      {
        x /= 2;
      }
    }
    
    System.out.println(count);
  }
}