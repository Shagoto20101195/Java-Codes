//Written by Shagoto
import java.util.*;
public class ZeroOneGame
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    read.nextLine();
    for(int x = 1; x<=t; x++)
    {
      String s = read.nextLine();
      int count0 = 0;
      int count1 = 0;
      
      for(int i = 0; i<s.length(); i++)
      {
        if(s.charAt(i) == '1')
        {
          count1++;
        }
        else
        {
          count0++;
        }
      }
      
      int min = Math.min(count1, count0);
      
      if(min % 2 == 1)
      {
        System.out.println("DA");
      }
      else
      {
        System.out.println("NET");
      }
    }
  }
}