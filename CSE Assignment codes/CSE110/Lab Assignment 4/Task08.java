import java.util.Scanner;
public class Task08
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int x;
    int divisor = 0;
    for(x=1; x<=num; x++)
    {
      if(num % x == 0)
      {
        System.out.println(x);
        divisor = divisor + 1;
      }
    }
    
    System.out.println("Total "+divisor+" divisors");
  }
}