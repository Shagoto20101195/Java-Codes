//Written by Shagoto
import java.util.*;
public class Parity
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int b = read.nextInt();
    int k = read.nextInt();
    int [] a = new int[k];
    
    char temp = 'e';
    if(b % 2 == 0)
    {
      temp = 'e';
    }
    else
    {
      temp = 'o';
    }
    
    char total = 'e';
    char lastChar = 'e';
    for(int i = 0; i<a.length; i++)
    {
      a[i] = read.nextInt();
      
      if(a[i] % 2 == 0)
      {
        lastChar = 'e';
      }
      else
      {
        if(i == a.length - 1)
        {
          lastChar = 'o';
        }
        else if(temp == 'e')
        {
          lastChar = 'e';
        }
        else
        {
          lastChar = 'o';
        }
      }
      
      if((lastChar == 'e' && total == 'e') || (lastChar == 'o' && total == 'o'))
      {
        total = 'e';
      }
      else
      {
        total = 'o';
      }
    }
    
    if(total == 'e')
    {
      System.out.println("even");
    }
    else
    {
      System.out.println("odd");
    }
  }
}