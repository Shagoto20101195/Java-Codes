import java.util.Scanner;
public class Task30singleloop
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter start");
    int start = read.nextInt();
    
    System.out.println("Enter finish");
    int finish = read.nextInt();
    
    int x;
    int prime = 0;
    int perfect = 0;
    for(x=start; x<=finish; x++)
    {
      int count = 0;
      int y;
      
      for(y=1; y<=x; y++)
      {
        if(x % y == 0)
        {
          count = count + 1;
        }
      }
      
       if(count == 2)
        {
          prime  = prime + 1;
        }
      
      int z;
      int total = 0;
      
      for(z=1; z<x; z++)
      {
        if(x % z == 0)
        {
          total = total + z;
        }
      }
       
        if(total == x)
        {
          perfect = perfect + 1;
        }
    }
    
    System.out.println(prime+" prime number");
    System.out.println(perfect+" perfect number");
  }
}