import java.util.Scanner;
public class Task20
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int x;
    int mynum = num;
    int remain = 1;
    int value = 1;
    for(x=1; x<mynum; x++)
    {
      if(value == 0)
      {
        if(remain > 0)
        {
          value = num % 10;
          System.out.println(value);
        }
      }
      
      else
      {
        if(remain > 0)
        {
        value = num % 10;
        System.out.println(value);
        }
      }
      
      if(remain == 0)
      {
        value = 0;
      }
      
      else
      {
        remain = num / 10;
        num = remain;
      }
      
      
    }
  }
}