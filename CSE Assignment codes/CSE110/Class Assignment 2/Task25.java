import java.util.Scanner;
public class Task25
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int count = 0;
    int i;
    for(i=1; i<=num; i++)
    {
      if(num % i == 0)
      {
        count = count + 1;
      }
    }
    
    System.out.println(count);
  }
}