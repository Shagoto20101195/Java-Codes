// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class BeltedRooms
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = Integer.parseInt(read.nextLine());
    for(int x = 1; x<=t; x++)
    {
      int n = Integer.parseInt(read.nextLine());
      String s = read.nextLine();
      
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      for(int i = 0; i<s.length(); i++)
      {
        if(s.charAt(i) == '>')
        {
          count1++;
        }
        else if(s.charAt(i) == '<')
        {
          count2++;
        }
        else
        {
          count3++;
        }
      }
      
      if(count1 == n || count2 == n || count3 == n || count1 == 0 || count2 == 0)
      {
        System.out.println(n);
      }
      else
      {
        int count = 0;
        s += s.charAt(0);
        for(int i = 0; i<n; i++)
        {
          if(s.charAt(i) == '-' || s.charAt(i+1) == '-')
          {
            count++;
          }
        }
        System.out.println(count);
      }
    }
  }
}