//Written by Shagoto
import java.util.*;
public class BerlandPoker
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int m = read.nextInt();
      int remainJ = m;
      int k = read.nextInt();
      
      int epc = n / k;
      int player1 = 0;
      
      if(m<=epc)
      {
        player1 = m;
        remainJ = 0;
      }
      else
      {
        player1 = epc;
        remainJ = m - epc;
      }
      
      int y = 0;
      if(remainJ % (k-1) == 0)
      {
        y = remainJ / (k-1);
      }
      else
      {
        y = remainJ / (k-1) + 1;
      }
      
      System.out.println(player1 - y);
    }
  }
}