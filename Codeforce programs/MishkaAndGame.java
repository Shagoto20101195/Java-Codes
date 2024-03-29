//Written by Shagoto
import java.util.*;
public class MishkaAndGame
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = 0;
    int c = 0;
    
    for(int i = 0; i<n; i++)
    {
      int s1 = read.nextInt();
      int s2 = read.nextInt();
      
      if(s1 > s2)
      {
        m++;
      }
      else if(s1 < s2)
      {
        c++;
      }
    }
    
    if(m > c)
    {
      System.out.println("Mishka");
    }
    else if(m < c)
    {
      System.out.println("Chris");
    }
    else
    {
      System.out.println("Friendship is magic!^^");
    }
  }
}