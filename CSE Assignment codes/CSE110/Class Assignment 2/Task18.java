import java.util.Scanner;
public class Task18
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int remain = 1;
    int digit = 0;
    while(remain>0)
    {
      remain = num/10;
      num = remain;
      digit = digit + 1;
    }
    System.out.println(digit+" digit");
  }
}