//Written by Shagoto
import java.util.*;
public class BachgoldProblem
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    
    if(n == 3)
    {
      System.out.println(1+"\n"+3);
    }
    
    else if(n % 2 == 0)
    {
      System.out.println(n / 2);
      
      for(int i = 0; i<n / 2; i++)
      {
        System.out.print(2+" ");
      }
      
      System.out.println();
    }
    
    else
    {
      System.out.println(n / 2);
      
      for(int i = 0; i<n / 2 - 1; i++)
      {
        System.out.print(2+" ");
      }
      
      System.out.println(3);
    }
  }
}