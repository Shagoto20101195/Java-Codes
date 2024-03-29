import java.util.Scanner;
public class Task08
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter article number");
    int article = read.nextInt();
    
    int fees = 500 * article;
    System.out.println("Total fees = "+fees);
  }
}