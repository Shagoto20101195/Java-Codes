//Written by Shagoto
import java.util.*;
public class Equation
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    
    if(n % 2 == 0)
    {
      if(n > 2)
      {
        System.out.println((2*n)+" "+n);
      }
      else
      {
        System.out.println("6 4");
      }
    }
    else
    {
      System.out.println((n+9)+" "+9);
    }
  }
}