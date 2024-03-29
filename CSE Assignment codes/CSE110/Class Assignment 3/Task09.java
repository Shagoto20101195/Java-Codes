import java.util.Scanner;
public class Task09
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int x = read.nextInt();
    
    System.out.println("Enter number");
    int y = read.nextInt();
    
    System.out.println("Enter number");
    int z = read.nextInt();
    
    if(x > y)
    {
      if(x > z)
      {
        System.out.println("Largest number = "+x);
      }
    }
      
      if(y > x)
      {
        if(y > z)
        {
          System.out.println("Largest number = "+y);
        }
      }
      
      if(z > x)
    {
      if(z > y)
      {
        System.out.println("Largest number = "+z);
      }
    }
  }
}