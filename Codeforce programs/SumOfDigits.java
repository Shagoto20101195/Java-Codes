//Written by Shagoto
import java.util.*;
public class SumOfDigits
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    if(s.equals(0))
    {
      System.out.println(0);
    }
    else
    {
      long count = 0;
      while(s.length() > 1)
      {
        s = s.replace("0","");
        long sum = 0;
        for(int i = 0; i<s.length(); i++)
        {
          sum += Long.parseLong(s.charAt(i) + "");
        }
        s = sum + "";
        count++;
      }
      
      System.out.println(count);
    }
  }
}