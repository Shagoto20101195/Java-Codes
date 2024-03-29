//Written by Shagoto
import java.util.*;
public class IsItRated
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    boolean check = false;
    int [] before = new int[n];
    int [] after = new int[n];
    
    for(int i = 0; i<n; i++)
    {
      before[i] = read.nextInt();
      after[i] = read.nextInt();
      
      if(before[i] != after[i])
      {
        check = true;
      }
    }
    
    if(check)
    {
      System.out.println("rated");
    }
    else
    {
      boolean check1 = true;
      for(int i = 1; i<n; i++)
      {
        if(before[i] > before[i-1])
        {
          check1 = false;
          break;
        }
      }
      
      if(check1)
      {
        System.out.println("maybe");
      }
      else
      {
        System.out.println("unrated");
      }
    }
  }
}