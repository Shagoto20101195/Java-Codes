//Written by Shagoto
import java.util.*;
public class ArpasHardExamAndCheat
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    
    if(n == 0)
    {
      System.out.println(1);
    }
    else if(n % 4 == 1)
    {
      System.out.println(8);
    }
    else if(n % 4 == 2)
    {
      System.out.println(4);
    }
    else if(n % 4 == 3)
    {
      System.out.println(2);
    }
    else if(n % 4 == 0)
    {
      System.out.println(6);
    }
  }
}