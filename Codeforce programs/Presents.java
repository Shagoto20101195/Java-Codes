//Written by Shagoto
import java.util.*;
public class Presents
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
   
    int n = read.nextInt();
    int [] a = new int[n+1];
    for(int i = 1; i<=n; i++)
    {
      int x = read.nextInt();
      a[x] = i;
    }
    
    for(int i = 1; i<=n; i++)
    {
      System.out.println(a[i]);
    }
  }
}