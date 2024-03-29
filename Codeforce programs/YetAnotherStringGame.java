// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class YetAnotherStringGame
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    read.nextLine();
    for(int x = 1; x<=t; x++)
    {
      String s = read.nextLine();
      for(int i = 0; i<s.length(); i++)
      {
        int temp = (int)s.charAt(i);
        if(i % 2 == 0)
        {
          if(temp == 97)
          {
            System.out.print('b');
          }
          else
          {
            System.out.print('a');
          }
        }
        else
        {
          if(temp == 122)
          {
            System.out.print('y');
          }
          else
          {
            System.out.print('z');
          }
        }
      }
      System.out.println();
    }
  }
}