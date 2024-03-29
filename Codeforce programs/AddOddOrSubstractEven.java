//Written by Shagoto
import java.util.*;
public class AddOddOrSubstractEven
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int i = 1; i<=t; i++)
    {
      long numA = read.nextLong();
      long numB = read.nextLong();
      
      if(numA == numB)
      {
        System.out.println(0);
      }
      else if(numA > numB)
      {
        if((numA - numB) % 2 == 0)
        {
          System.out.println(1);
        }
        else
        {
          System.out.println(2);
        }
      }
      else if(numA < numB)
      {
        if((numB - numA) % 2 == 1)
        {
          System.out.println(1);
        }
        else
        {
          System.out.println(2);
        }
      }
    }
  }
}