//Written by Shagoto
import java.util.*;
public class DiceRolling
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int a = read.nextInt();
      
      if(a >= 2 && a <= 7)
      {
        System.out.println(1);
      }
      else
      {
        System.out.println(a / 7 + 1);
      }
    }
  }
}