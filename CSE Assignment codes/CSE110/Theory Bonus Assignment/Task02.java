//import java.util.Scanner;
public class Task02
{
  public static void main(String[]args)
  {
    //Scanner read = new Scanner (System.in);
    
    int num = 3;
    int sum = 0;
    while(num <= 300000)
    {
      System.out.println(num);
      sum = sum + num;
      num = num * 10;
    }
    
    System.out.println("Sum = "+sum);
  }
}