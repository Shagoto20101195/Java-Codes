//Written by Shagoto
import java.util.*;
public class VasyaAndSocks
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    int count = 0;
    
    while(n > 0)
    {
      n--;
      count++;
      
      if(count % m == 0)
      {
        n++;
      }
    }
    
    System.out.println(count);
  }
}