import java.util.*;
import java.io.*;
public class WasteSorting
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int c1 = read.nextInt();
      int c2 = read.nextInt();
      int c3 = read.nextInt();
      int a1 = read.nextInt();
      int a2 = read.nextInt();
      int a3 = read.nextInt();
      int a4 = read.nextInt();
      int a5 = read.nextInt();
      
      if(a1 > c1 || a2 > c2 || a3 > c3 || a1+a2+a3+a4+a5 > c1+c2+c3)
      {
        System.out.println("NO");
      }
      else
      {
        c1 -= a1;
        c2 -= a2;
        c3 -= a3;
        
        if((a4 > 0 && c1 == 0 && c3 == 0) || (a5 > 0 && c2 == 0 && c3 == 0) || a4 > c1 + c3 || a5 > c2 + c3)
        {
          System.out.println("NO");
        }
        else
        {
          System.out.println("YES");
        }
      }
    }
  }
}