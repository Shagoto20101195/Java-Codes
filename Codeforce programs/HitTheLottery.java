//Written by Shagoto
import java.util.*;
public class HitTheLottery
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    
    int count = 0;
    while(n > 0)
    {
      if(n >= 100)
      {
        count += (n / 100);
        n %= 100;
      }
      else if(n >= 20)
      {
        count += (n / 20);
        n %= 20;
      }
      else if(n >= 10)
      {
        count += (n / 10);
        n %= 10;
      }
      else if(n >= 5)
      {
        count += (n / 5);
        n %= 5;
      }
      else if(n >= 1)
      {
        count += (n / 1);
        n %= 1;
      }
    }
    
    System.out.println(count);
  }
}