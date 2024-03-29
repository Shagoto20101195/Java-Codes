//Written by Shagoto
import java.util.*;
public class KanaAndDragonQuestGame
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int a = 1; a<=t; a++)
    {
      int x = read.nextInt();
      int n = read.nextInt();
      int m = read.nextInt();
      
      if(m == 0)
      {
        System.out.println("NO");
      }
      else if(x <= 10 && m > 0)
      {
        System.out.println("YES");
      }
      else
      {
        while(n > 0)
        {
          x = (x / 2) + 10;
          n--;
        }
        
        while(m > 0)
        {
          x -= 10;
          m--;
          
          if(x <= 0)
          {
            break;
          }
        }
        
        if(x <= 0)
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
}