//Written by Shagoto
import java.util.*;
public class DoubleCola
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int drinks = 0;
    int index = 0;
    int lastSum = 0;
    
    for(int i = 1; drinks < n; i*=2)
    {
      lastSum = drinks;
      drinks += i*5;
      index = i;
    }
    
    lastSum += index;
    for(int i = 1; i<=5; i++)
    {
      if(n > lastSum)
      {
        lastSum += index;
      }
      else if(i == 1)
      {
        System.out.println("Sheldon");
        break;
      }
      else if(i == 2)
      {
        System.out.println("Leonard");
        break;
      }
      else if(i == 3)
      {
        System.out.println("Penny");
        break;
      }
      else if(i == 4)
      {
        System.out.println("Rajesh");
        break;
      }
      else if(i == 5)
      {
        System.out.println("Howard");
        break;
      }
    }
  }
}