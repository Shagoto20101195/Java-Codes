//Written by Shagoto
import java.util.*;
public class OracAndFactors
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int k = read.nextInt();
      
      if(n % 2 == 0)
      {
        System.out.println(n + (2*k));
      }
      else
      {
        int temp = 0;
        for(int i = 3; i<=(int)Math.sqrt(n); i++)
        {
          if(n % i == 0)
          {
            temp = i;
            break;
          }
        }
        
        if(temp == 0)
        {
          temp = n;
        }
        System.out.println(n + (2*k) - 2 + temp);
      }
    }
  }
}