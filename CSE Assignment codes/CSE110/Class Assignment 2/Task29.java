import java.util.Scanner;
public class Task29
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int total = 0;
    int x;
    for(x=1; x<=num; x++)
    {
      if(num == x)
      {
        
      }
      else if(num % x == 0)
      {
        total = total + x;
      }
      
    }
    if(total == num)
    {
      System.out.println("Perfect number");
    }
    
    else
    {
      System.out.println("Not perfect number");
    }
  }
}