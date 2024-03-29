// Right index hollow triangle
// (Having the input value at first row)
import java.util.Scanner;
public class Problem19
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    for(int i =1; i<=n; i++) // main loop from the input
    {
      for(int j = 1; j<=n-i; j++) // loop for initial spaces
      {
        System.out.print(" ");
      }
      /* condtion j<=i means how many elements (numbers or spaces) for i'th row*/
      for(int j = 1; j<=i; j++) // loop for printing number or spaces
      {
        if(i==j || i==n || j==1 || j==n) // condition for where to print numbers
        {
          System.out.print(n-i+j);
          /* here n is constant, with every value of i, the value of j will start from 1,
              giving the smallest number at start */
        }
        else
        {
          System.out.print(" "); // if condition doesn't match then print spaces
        }
      }
      System.out.println(); // for moving to new line
    }
  }
}