import java.util.Scanner;
public class crossX
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    
    for(int i = 1; i<=n; i++) // loop for upper part
    {
      
      for(int j = 1; j<=i-1; j++) // loop for initial spaces
      {
        System.out.print(" ");
      }
      
      System.out.print("*");
      for(int j = 1; j<=2*(n-i)-1; j++) // loop for inside spaces
      {
        System.out.print(" ");
      }
      if(i<n) // when i=n you need print one star, before that always two stars
      {
        System.out.print("*");
      }
      
      System.out.println();
    }
    
    for(int i = 1; i<=n-1; i++) // loop for lower part
    {
      
      for(int j = 1; j<=n-i-1; j++) // loop for initian spaces
      {
        System.out.print(" ");
      }
      
      System.out.print("*");
      for(int j = 1 ; j<=2*i-1; j++) // loop for inside spaces
      {
        System.out.print(" ");
      }
      System.out.print("*");
      
      System.out.println();
      
    }
  }
}