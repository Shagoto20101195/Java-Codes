//Written by Shagoto
import java.util.Scanner;
public class Tram
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    if(n>=2 && n<=1000)
    {
      int exit1 = read.nextInt();
      int enter1 = read.nextInt();
      int remain = enter1;
      
      int max = remain;
      int i = 2;
      while(i<=n)
      {
        int exit = read.nextInt();
        int enter = read.nextInt();
        
        remain = remain - exit;
        remain = remain + enter;
        
        if(remain>max)
        {
          max = remain;
        }
        
        i = i + 1;
      }
      
      System.out.println(max);
    }
  }
}
