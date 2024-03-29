//Written by Shagoto
import java.util.*;
public class EhabAndMahmoudAndEvenOddGame
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    
    if(n % 2 == 0)
    {
      System.out.println("Mahmoud");
    }
    else
    {
      System.out.println("Ehab");
    }
  }
}