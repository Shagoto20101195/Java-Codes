import java.util.Scanner;
public class Task30
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter start");
    int start = read.nextInt();
    System.out.println("Enter finish");
    int finish = read.nextInt();
    
    int prime = 0;
    int perfect = 0;
    int loop1;
    int loop2;
    
   
    
    for(loop1=start; loop1<=finish; loop1++)
    {
      int total = 0;
      int x;
    
      for(x=1; x<=loop1; x++)
      {
        if(loop1 == x)
        {
        }
        
        else if(loop1 % x == 0)
        {
          total = total + x;
        }
      }
      
      if(total == loop1)
      {
        perfect = perfect + 1;
      }
    }
    
    for(loop2=start; loop2<=finish; loop2++)
    {
      int count = 0;
      int y;
      
      for(y=1; y<=loop2; y++)
      {
        if(loop2 % y == 0)
        {
          count = count + 1;
        }
      }
      
      if(count == 2)
      {
        prime = prime + 1;
      }
    }
    
    System.out.println(prime+" prime number");
    System.out.println(perfect+" perfect number");
  }
}