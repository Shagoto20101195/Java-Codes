// Hollow rhombus with numbers starting from 1
import java.util.Scanner;
public class Problem23
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    for(int i = 1; i<=n; i++) // loop for upper part
    {
      for(int j = 1; j<=n-i; j++) // loop for (initial) spaces
      {
        System.out.print(" ");
      }
      for(int j = 1; j<=2*i-1; j++) // loop for upper part numbers
      {
        if(j==1 || j==2*i-1) // condition is only to print when 1 and last number 
        {
          System.out.print(j);
        }
        else // else keep on printing (inside of rhombus) spaces
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
    for(int i = 1; i<=n-1; i++) // loop for lower part
    {
      for(int j = 1; j<=i; j++) // loop for (initial) spaces
      {
        System.out.print(" ");
      }
      for(int j = 1; j<=2*(n-i)-1; j++) // loop for lower part numbers
      {
        if(j==1 || j==2*(n-i)-1) // condition is only to print when 1 and last number 
        {
          System.out.print(j);
        }
        else // else keep on printing (inside of rhombus) spaces
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}