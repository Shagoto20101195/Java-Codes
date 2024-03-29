import java.util.Scanner;
public class Task6
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter quantity");
    int quantity = read.nextInt();
    
    int i;
    for(i=1; i<=quantity; i=i+1)
    {
      System.out.println("Enter number");
      int num = read.nextInt();
      
      if(num % 2 == 0)
      {
        System.out.println("Even");
      }
      
      else
      {
        System.out.println("Odd");
      }
    }
  }
}