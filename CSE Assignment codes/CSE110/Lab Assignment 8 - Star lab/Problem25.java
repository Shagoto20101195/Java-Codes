//Code for triangle palindrome
import java.util.Scanner;
public class Problem25
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=n-i; j++) // Loop for space
      {
        System.out.print(" ");
      }
      
      if(i==1)  // Because only for first line there is no reverse
      {
        System.out.print(1);
      }
      else
      {
        for(int j = 1; j<=i; j++) // Loop for forward numbers
        {
          System.out.print(j);
        }
        for(int a = i-1; a>=1; a--) // Loop for reverse numbers
        {
          System.out.print(a);
        }
      }
      System.out.println();
    }
  }
}