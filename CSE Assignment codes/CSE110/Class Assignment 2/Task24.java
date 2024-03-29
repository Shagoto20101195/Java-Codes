import java.util.Scanner;
public class Task24
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int i;
    for(i=1; i<=num; i++)
    {
      System.out.println(i);
    }
  }
}