import java.util.Scanner;
public class Task05
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int num = read.nextInt();
    
    int x;
    int total = 0;
    int count = 0;
   
    for(x=1; x<=num; x++)
    {
      if(num == x)
      {
    //    if(num % x == 0)
    //    {
          count = count + 1;
    //    }
      }
      
      
      else if(num % x == 0)
      {
        count  = count + 1;
        total = total + x;
      }
    }
    if(count == 2)
    {
      System.out.println(num);
    }
    
    else if(total == num)
    {
      System.out.println(num);
    }
  }
}