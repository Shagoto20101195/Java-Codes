//Written by Shagoto
import java.util.*;
public class MostUnstableArray
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int k = read.nextInt();
      
      if(n == 1)
      {
        System.out.println(0);
      }
      else if(n == 2)
      {
        System.out.println(k);
      }
      else
      {
        System.out.println(k + k);
      }
    }
  }
}