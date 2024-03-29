import java.util.Scanner;
public class Task9
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int x;
    int total = 0;
    for(x=1; x<num; x++)
    {
      if(num % x == 0)
      {
        total = total + x;
      }
    }
    
    if(total == x)
    {
      System.out.println("Perfect number");
    }
    
    else
    {
      System.out.println("Not perfect number");
    }
  }
}